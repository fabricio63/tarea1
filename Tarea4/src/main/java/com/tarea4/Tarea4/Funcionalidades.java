package com.tarea4.Tarea4;

import java.lang.reflect.Array;

public class Funcionalidades {
    public static String A (Array info){
        return "helloaeae";
    }
    public static String B (Array info){
        return "hellol";
    }
    public static String C (){
        return "hellom";
    }public static String D (){
        return "hellol";
    }public static String E (){
        return "hellor";
    }public static String F (){
        return "hellow";
    }public static String G (){
        return "hellor";
    }public static String H (){
        return "hellos";
    }public static String I (){
        return "hel";
    }


    public static String J (){
        return "hell";

    }
    public static String decider (String type,Array info){
        String RESPUESTA = "NULL";
        for (int i=0;i< 10 ; i++){
            if (i == 0){
                A(info);
            }
            if (i == 1){
                B(info);
            }if (i == 2){
                C();
            }if (i == 3){
                D();
            }if (i == 4){
                E();
            }
            if (i == 5){
                F();
            }if (i == 6){
                G();
            }
            if (i == 7){
                H();
            }
            if (i == 8){
                I();
            }
            if (i == 9){
                J();
            }

            return RESPUESTA;


        }
        return RESPUESTA;

    }












}
