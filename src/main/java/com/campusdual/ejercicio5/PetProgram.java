package com.campusdual.ejercicio5;
//  -Se pueden dar de alta personas: Las personas tendrán los siguientes atributos: nombre, apellidos, peso, altura, edad y sexo.
//    -Las personas podrán tener asignadas una lista de dietas que se catalogarán de lunes a domingo sacadas de la lista de dietas anterior.
//    -Se agregara un apartado nuevo al menú de "Gestión de pacientes" con las siguientes funcionalidades:
//      1- Dar de alta un paciente : Agregará un paciente nuevo a la lista de pacientes
//      2- Listar y Mostrar detalles de un paciente : Mostrará el detalle de un paciente así como todas sus dietas listadas de Lunes a domingo
//      3- Asignar una dieta: Muestra la lista de dietas general y puede asignarle una a un día de la semana del paciente.
//      4- Dar de baja un paciente: Elimina los datos de un paciente(No borra sus dietas asignadas dado que pueden estar asignadas a otro paciente)

public class PetProgram {
    private Pet petActive;
    public PetProgram(Pet petActive) {
        this.petActive = petActive;
    }


    public void showPetProgram(){
        System.out.println("########################################################");
        System.out.println("################# Programa de dietas ###################");
        System.out.println("############# mascota:"+petActive.getName()+" especie:"+petActive.getSpecies()+"#############");
        Integer option;
        do{
            System.out.println("Escriba una opción:");
            System.out.println("===================================");
            System.out.println("1.- Cambiar de mascota");
            System.out.println("2.- Mostrar Informacion");
            System.out.println("3.- Gestionar sus dietas");
            System.out.println("4.- Salir del programa");
            option = Kb.getOption(1,4);
            switch (option){
                case 1:
                    //chagePet();
                    break;
                case 2:
                    this.petActive.showPetDetails();
                    break;
                case 3:
                    //managePetDiets();
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa, hasta pronto :)");
                    break;
            }
        }while(option != 4);
    }

}
