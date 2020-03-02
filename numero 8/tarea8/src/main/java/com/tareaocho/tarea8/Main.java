package com.tareaocho.tarea8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;

@Controller
public class Main {

    Trabajador Worker;
    LinkedList trabajadores = new LinkedList<Trabajador>();
    @RequestMapping("/home")
    @ResponseBody
    public String home (@RequestParam String empresa, Integer social,int dias,String nombre){
        Worker = new Trabajador(social,empresa,dias,nombre);
        trabajadores.add(Worker);
        return "added";

    };

    @RequestMapping("/deploy")
    @ResponseBody
    public String deploy (){
        String deployed = "";
        for (int i = 0; i < trabajadores.size();i++){
            Trabajador temp = (Trabajador) trabajadores.get(i);
            deployed = deployed + temp.show_all() + "\n" ;


        }
        return deployed;

    };

}
