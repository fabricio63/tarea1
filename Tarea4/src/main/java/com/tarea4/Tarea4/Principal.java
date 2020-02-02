package com.tarea4.Tarea4;

import net.minidev.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Queue;

@Controller
public class Principal {
  int index = 0;
  int size =  -1;

  public static String[] Bank (int size){
    String q[] = new String[size];
    return q;
  }
  String[] queue = Bank(size);
  @RequestMapping( value = {"/deposit"})
    @ResponseBody
    public String[] body (@RequestParam String Info){
    String[] temp_queue =  queue;
    queue = Bank(size +1);
    for (int i = 0; i <size ; i ++){
      queue[i] = temp_queue[i];
    }
    queue[index++] = Info;
    


      return queue;
  }



}
