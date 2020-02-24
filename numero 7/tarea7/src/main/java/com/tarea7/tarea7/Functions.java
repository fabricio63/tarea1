package com.tarea7.tarea7;

import java.util.LinkedList;

public class Functions {
    int playing = 0;
    public static String play(LinkedList list){
        int playing = 0;
        return (String) list.get(0);
    }
    public static String next ( int playing,LinkedList list){
        System.out.println( list.get(playing));
        return (String) list.get(playing);
    }
    public static String previous(int playing,LinkedList list){
        System.out.println( list.get(playing));
        return (String) list.get(playing);

    }
    public static LinkedList add (LinkedList list, String Song){
        list.add(Song);
        return list;
    }
    public LinkedList show(LinkedList list){
        return list;
    }

}
