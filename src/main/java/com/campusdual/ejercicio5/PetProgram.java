package com.campusdual.ejercicio5;

public class PetProgram {
    private Pet petActive;
    public PetProgram(Pet petActive) {
        this.petActive = petActive;
    }


    public void showPetProgram(){
        System.out.println("########################################################");
        System.out.println("################# Programa de dietas ###################");
        System.out.println("########################################################");
        Integer option;
        do{
            System.out.println("Escriba una opción:");
            System.out.println("===================================");
            System.out.println("1-");
            System.out.println("2-");
            System.out.println("3-");
            System.out.println("4-Salir del programa");
            option = Kb.getOption(1,4);
            switch (option){
                case 1:
                    //createMenu();
                    break;
                case 2:
                    //showDetailsMenu();
                    break;
                case 3:
                    //addFoodMenu();
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa, hasta pronto :)");
                    break;
            }
        }while(option != 4);
    }

}
