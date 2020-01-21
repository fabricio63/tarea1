package com.example.demo;

import java.util.ArrayList;

public class Metodos {
    public static ArrayList  add (ArrayList People,String type){
        People.add(type);
        System.out.println(People);
        return People;


    }

    public static ArrayList delete (ArrayList People){
        String temporal = (String) People.get(0);
        System.out.println(temporal);
        People.remove(0);
        return People;
    }
    public static ArrayList clear (ArrayList People){
        People.clear();
        return People;
    }
}
