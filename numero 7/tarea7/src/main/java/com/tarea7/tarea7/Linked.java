package com.tarea7.tarea7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;

@Controller
public class Linked {

    LinkedList playlist = new LinkedList();
    int playing = 0;
    String played;
    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam String Song){
        Functions.add(playlist,Song);
        return "added: "+ Song ;

    }
    @RequestMapping("/play")
    @ResponseBody
    public String play(){
        return "playing:  "+ Functions.play(playlist) ;
    }

    @RequestMapping("/next")
    @ResponseBody
    public String next(){
        playing = playing +1;
        return "playing:  "+ Functions.next(playing,playlist) ;
    }
    @RequestMapping("/previous")
    @ResponseBody
    public String previous(){
        playing = playing -1;
        if (playing > 0) {
            played = Functions.previous(playing, playlist);
        }else{
            played ="not found";
        }
        return "playing:  "+ played ;
    }
    @RequestMapping("/show")
    @ResponseBody
    public LinkedList show(){
        return playlist ;
    }
}
