package com.cuatro.cuatro;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Arrays;

@Controller
public class Metodos {
    Integer[] Deposits = new Integer[0];
    Integer[] Credits = new Integer[0];
    @RequestMapping (value = {"/deposit"})
    @ResponseBody
    public  String deposit(@RequestParam Integer amount){

        Deposits = Arrays.copyOf(Deposits,Deposits.length +1);
        Deposits[Deposits.length-1] = amount;
        for (int i = 0; i<Deposits.length;i++){
            System.out.println(Deposits[i]);}
        System.out.println("----------");

        return "succes";
    }
    @RequestMapping (value = {"/credits"})
    @ResponseBody
    public String credit (@RequestParam Integer amount ){

        Credits = Arrays.copyOf(Credits,Credits.length +1);
        Credits[Credits.length-1] = amount;
        for (int i = 0; i<Credits.length;i++){
            System.out.println(Credits[i]);}
        System.out.println("----------");

        return "success";
    }
    @RequestMapping (value = {"/inc"})
    @ResponseBody
    public int c (){
        int result = 0;
        for (int i = 0 ; i < Deposits.length; i ++){
            result = result + Deposits[i];
        }
        return result;
    }
    @RequestMapping (value = {"/ind"})
    @ResponseBody
    public int d (){
        int result = 0;
        for (int i = 0 ; i < Credits.length; i ++){
            result = result + Credits[i];
        }
        return result;
    }

    @RequestMapping (value = {"/ine"})
    @ResponseBody
    public int e (){

        return c() - d();
    }
    @RequestMapping (value = {"/inf"})
    @ResponseBody
    public int f (){

        return c()/Deposits.length;
    }
    @RequestMapping (value = {"/ing"})
    @ResponseBody
    public int g (){
        int max = Deposits[0];
        for (int i = 1; i < Deposits.length;i++){
            if (Deposits[i] > max){
                max = Deposits[i];

            }
        }

        return max;
    }

    @RequestMapping (value = {"/inh"})
    @ResponseBody
    public String h (){
        String result = "number of debits is: " + Deposits.length + " number of credits is: " + Credits.length;

        return result;
    }

    @RequestMapping (value = {"/ini"})
    @ResponseBody
    public String i (){
        System.out.println("Deposits are:");
        for (int i = 0; i<Deposits.length;i++){
            System.out.println(Deposits[i]);}
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("Credits are:");
        for (int i = 0; i<Credits.length;i++){
            System.out.println(Credits[i]);}
        System.out.println("--------------------");
         return "printed on terminal";
    }
    @RequestMapping(value = {"/inj"})
    @ResponseBody
    public Integer eliminate(@RequestParam int Position){
        Integer [] temp_credits = Credits;
        Integer size = Credits.length - 1;
        Credits = new Integer[size];
        int gate = 0;
        for (int i = 0; i < Credits.length; i++) {
            if (i == Position) {
               gate = 1;
            }
            if (gate == 0) {
                Credits[i] = temp_credits[i];
            }
            if (gate == 1){
                Credits[i] = temp_credits [i+1];
            }
        }
        for (int i = 0; i<Credits.length;i++){
            System.out.println(Credits[i]);}
        System.out.println("----------");

        return size;
    }
}
