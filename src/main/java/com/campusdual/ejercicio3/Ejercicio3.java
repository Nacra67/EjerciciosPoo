package com.campusdual.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Integer numero;
        System.out.println("Escriba su numero");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        ser_primo(numero);
    }
    public static void ser_primo(Integer numero){
        switch (numero){
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
                System.out.println(numero + " es primo");
                break;
            default:
                System.out.println(numero + " no es primo");
        }
    }
}
