package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] numeros = new int[12];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pon el numero de veces que quieras tirar los dados. ");
        int tirades = scanner.nextInt();
        int dadoUno;
        int dadoDos;




        System.out.println("Se estan lanzando los dados.");


        for(int i = 0; i < tirades; ++i) {
            dadoUno = (int)(Math.random() * 6.0D) + 1;
            dadoDos = (int)(Math.random() * 6.0D) + 1;
            ++numeros[dadoUno + dadoDos - 1];
        }

        System.out.println("Estos han sido los resultados.");

        for(int i = 1; i < 12; ++i) {
            System.out.println(i + 1 + " ha salido -> " + numeros[i] + " veces");
        }

    }
}
