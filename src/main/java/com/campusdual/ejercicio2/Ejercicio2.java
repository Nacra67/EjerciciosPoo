package com.campusdual.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        anos_bisiestos(44);
        anos_bisiestos(400);
        anos_bisiestos(500);
        anos_bisiestos(2000);
        anos_bisiestos(1231);

    }
    public static void anos_bisiestos(int ano){
        System.out.println("Calculando año " + ano);
        if (ano%4 != 0) {
            System.out.println("no bisiesto");
        }
        else {
            if(ano%100 != 0){
                System.out.println("bisiesto!!!");
            }
            else {
                if (ano%400 == 0){
                    System.out.println("bisiesto 400!!!");

                    }
                else {
                    System.out.println("secular desos");
                }
            }
        }
        System.out.println("_______________");
    }


}
