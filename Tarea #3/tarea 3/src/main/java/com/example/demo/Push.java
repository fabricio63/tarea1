package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class Push {
    ArrayList<String> People = new ArrayList<String>();

    @RequestMapping(value = {"/push"})
    @ResponseBody
    public ArrayList push(@RequestParam String type, String name, String amount) {

        return Metodos.add(People,type,name,amount);
    }
    @RequestMapping(value = {"/pop"})
    @ResponseBody
    public ArrayList pop() {

        return Metodos.delete(People);
    }
    @RequestMapping(value = {"/clear"})
    @ResponseBody
    public ArrayList clear() {

        return Metodos.clear(People);
    }
    @RequestMapping(value = {"/show"})
    @ResponseBody
    public ArrayList show () {
        return People;
    }

}
