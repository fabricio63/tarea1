package com.cinco.cinco;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Principal {

    @RequestMapping(value = {"/counter"})
    @ResponseBody
    public String count (@RequestParam String info) {
         return Metodos.counter2(info);
    }
}
