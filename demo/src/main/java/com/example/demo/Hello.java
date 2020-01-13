package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Hello {
    @RequestMapping("/")
    public String index(){
        Scanner entrada_int = new Scanner(System.in);
        int a;
        System.out.println("ingrese nota del alumno:");
        a = entrada_int.nextInt();
        if (a > 75){
            return "nota es: O";
        }
        else {
            if (a >= 60){
                return"nota es: A";


            }else if (a >= 50){
                return"nota es: `B";
            } else if (a >= 40){
                return "nota es: C";
            }
            else {
                return "nota es: D";
            }

        }

    }
}
