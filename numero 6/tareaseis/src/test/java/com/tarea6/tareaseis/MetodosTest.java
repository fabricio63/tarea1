package com.tarea6.tareaseis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetodosTest {

    @Test
    void cuadrante() {
        assertEquals("Cuadrante 3\n" +
                "\n" +
                "\n" +
                "\n" +
                "                     |\n" +
                "                     |\n" +
                "                     |\n" +
                "                     |\n" +
                "                     |\n" +
                "                     |\n" +
                "                     |\n" +
                " -------------------------------------------\n" +
                " ||||||||||||||||||||| \n" +
                " |||||||||||||||||||||\n" +
                " |||||||||||||||||||||\n" +
                " |||||||||||||||||||||\n" +
                " |||||||||||||||||||||\n" +
                " |||||||||||||||||||||\n" +
                " |||||||||||||||||||||", Metodos.cuadrante(-5,-5));
    }
}