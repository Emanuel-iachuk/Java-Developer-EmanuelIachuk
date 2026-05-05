package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> armazen = new ArrayList<Integer>();

        while (true) {
            try {
                System.out.print("Digite um limite para o for: ");
                int limite = scn.nextInt();


                for (int i = 0; i <= limite; i++) {
                    Integer value = isPar.numberIsPar(i);
                    if (value == null)continue;

                    armazen.add(i);
                }
                System.out.println(armazen);
                break;

            } catch (Exception e) {
                System.err.println("Cara nos estamos buscado NUMEROS pares e não LETRAS pares");
                System.out.println();
                scn.nextLine();
                armazen.clear();
            }
        }

    }
}