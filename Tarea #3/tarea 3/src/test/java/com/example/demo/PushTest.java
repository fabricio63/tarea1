package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.MatcherAssert.assertThat;



class PushTest {
    @Test
    void addTest (){
        ArrayList<String> People = new ArrayList<String>();
        ArrayList<String> PeopleTest = new ArrayList<String>();
        PeopleTest.add("withdraw pedro 66");
        assertThat(Metodos.add(People, "withdraw pedro 66"), is(PeopleTest));
    }
    @Test
    void popTest() {
        ArrayList<String> People = new ArrayList<String>();
        ArrayList<String> PeopleTest = new ArrayList<String>();
        Metodos.add(People,"withdraw pedro 33");
        assertThat(Metodos.delete(People), is (PeopleTest));
    }
    @Test
    void clearTest() {
        ArrayList<String> People = new ArrayList<String>();
        ArrayList<String> PeopleTest = new ArrayList<String>();
        Metodos.add(People,"withdraw pedro 300");
        Metodos.add(People,"deposit juan 500");
        assertThat(Metodos.clear(People), is (PeopleTest));
    }
}