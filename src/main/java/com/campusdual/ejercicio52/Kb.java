package com.campusdual.ejercicio52;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kb {
    public static Integer nextInt(){
        Scanner keyboard = new Scanner(System.in);
        String resultString = keyboard.nextLine();
        Integer result = 0;
        try{
            result = Integer.parseInt(resultString);
        }catch (Exception e){
            throw new InputMismatchException();
        }
        return result;
    }

    public static Integer sureNextInt(){
        Integer resultado = null;
        boolean notvalid=true;
        do {
            try {
                resultado = nextInt();
                notvalid=false;
            } catch (InputMismatchException e) {
                System.out.println("Es necesario que sea un número");
            }
        }while(notvalid);
        return resultado;
    }

    public static String nextLine(){
        Scanner keyboard = new Scanner(System.in);
        String result = keyboard.nextLine();
        return result;
    }
    public static String nextLine(String text) {
        System.out.print("text");
        Scanner keyboard = new Scanner(System.in);
        String result = keyboard.nextLine();
        return result;
    }
    public static void enterContinuar(String text){
        System.out.println("\n"+text);
        System.out.println("ENTER para continuar...\n");
        Scanner keyboard = new Scanner(System.in);
        String result = keyboard.nextLine();
    }
}
