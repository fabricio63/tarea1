package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class Push {

    String[] People = new String[0];

    @RequestMapping(value = {"/push"})
    @ResponseBody
    public String push(@RequestParam String type, String name, String amount) {
        String temp = type+ "-"+ name + "-" + amount;
        People = Arrays.copyOf(People,People.length +1);
        People[People.length-1] = temp;
        for (int i = 0; i<People.length;i++){
            System.out.println(People[i]);}
        System.out.println("----------");
        return "success";
    }
    @RequestMapping(value = {"/pop"})
    @ResponseBody
    public String pop() {
        String result = "list is empty";
        if (People.length != 0){
        People = Arrays.copyOfRange(People, 1, People.length);
        for (int i = 0; i<People.length;i++){
            System.out.println(People[i]);}
        System.out.println("----------");
        result = "success";
        }
        return result;
    }
    @RequestMapping(value = {"/clear"})
    @ResponseBody
    public void clear() {
        People = Arrays.copyOfRange(People, 0,0);

    }
    @RequestMapping(value = {"/show"})
    @ResponseBody
    public String[]show () {
        return People;
    }


}
