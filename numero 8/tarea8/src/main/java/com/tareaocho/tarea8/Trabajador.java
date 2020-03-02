package com.tareaocho.tarea8;

public class Trabajador {


    private int social,dias;
    private String empresa;
    private String nombre;

    public Trabajador(int social,String empresa, int dias,String nombre){
        this.social = social;
        this.empresa = empresa;
        this.nombre = nombre;
        this.dias = dias;

    }
    public int show_s (){
        return this.social;
    }
    public String show_e (){
        return this.empresa;
    }
    public String show_all(){
        String todo = this.social + " - "+this.nombre +" - "+this.dias;
        return todo;
    }

}
