package org.example;

import java.util.Random;

public class isPar {
    public enum TipoParidade{
        PAR, IMPAR
    }

    public static Integer filtrarNumero(int numero, TipoParidade tipo){
        if(tipo == TipoParidade.PAR && numero % 2 == 0){
            return numero;
        }
        if(tipo == TipoParidade.IMPAR && numero % 2 != 0){
            return numero;
        }
        return null;
    }

    public static int rolarDado(){
        Random gerador = new Random();
        return gerador.nextInt(6) + 1;
    }
}
