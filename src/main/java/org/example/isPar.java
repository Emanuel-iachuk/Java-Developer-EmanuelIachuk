package org.example;

import java.util.Random;

public class isPar {
    public static Integer numberIsPar(int number) {return number % 2 == 0 ? number: null;}
    public static Integer numberIsInpar(int number) {return number % 2 != 0 ? number: null;}

    public static int rolarDado(){
        Random gerador = new Random();
        return gerador.nextInt(6) + 1;
    }
}
