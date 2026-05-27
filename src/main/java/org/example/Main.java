package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numerosPar = new ArrayList<Integer>();
        ArrayList<Integer> numerosInpar = new ArrayList<Integer>();

        while (true) {
            try {
                System.out.print("Digite um limite para o for: ");
                if(scn.hasNextInt()) {
                    int limite = scn.nextInt();

                    for (int i = 0; i <= limite; i++) {
                        Integer valuePar = isPar.numberIsPar(i);
                        Integer valueInpar = isPar.numberIsInpar(i);

                        if (valuePar != null) numerosPar.add(valuePar);
                        if(valueInpar != null) numerosInpar.add(valueInpar);
                    }
                    System.out.println("Numeros pares: "+numerosPar);
                    System.out.println("=".repeat(50));
                    System.out.println("Numeros Inpares: "+numerosInpar);
                    break;

                }else{
                    System.err.println("Isso não é um número!");
                    scn.next();
                }

            } catch (Exception e) {
                System.err.println("Cara nos estamos buscado NUMEROS pares e não LETRAS pares");
                System.out.println();
                scn.nextLine();
                numerosPar.clear();
            }

        }

    }
}