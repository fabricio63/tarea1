package com.tarea6.tareaseis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Principal {
    Punto trial;
    @RequestMapping(value = {"/cuadra"})
    @ResponseBody
    public String cuadrante (@RequestParam int x, int y){
        trial = new Punto(x, y);
        return Metodos.cuadrante(trial.showx(),trial.showy());
    }

}
