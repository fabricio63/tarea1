package com.example.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import  java.util.Arrays;

public class Metodos {
    public static String[] add (int size, String type, String name, String amount,String[] People){
        String temp = type+ "-"+ name + "-" + amount;
        Arrays.copyOf(People,People.length +1);
        People[People.length] = temp;
        for (int i = 0; i<size;i++){
            System.out.println(People[i]);}

        return People;


    }

    public static ArrayList delete (ArrayList People){
        if (People.size() != 0) {
            People.remove(0);
        }
        return People;
    }
    public static ArrayList clear (ArrayList People){
        People.clear();
        return People;
    }
}
