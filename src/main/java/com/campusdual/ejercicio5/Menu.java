package com.campusdual.ejercicio5;
//--Teniendo en cuenta el programa anterior(ejercicio4):
//--Realiza los cambios necesarios para:
//  -La dieta ya no será única si no que se guardará en una lista de dietas. Esta lista tendrá un nombre para poder ser recuperado. Será necesario cambiar el menú para gestionar esta lista. Ahora en ved de crear/reemplazar dieta lo que haremos será:
//    a- Agregar dieta: Añade una dieta a la lista. Podemos reutilizar el menú antiguo de crear/reemplazar
//    b- Mostrar detalles de dieta: Muestra los detalles de una dieta y permite modificarla
//    c- Eliminar dieta: Elimina una dieta de la lista(Siempre que no la tenga asignada un paciente)
//
//  -Se pueden dar de alta personas: Las personas tendrán los siguientes atributos: nombre, apellidos, peso, altura, edad y sexo.
//    -Las personas podrán tener asignadas una lista de dietas que se catalogarán de lunes a domingo sacadas de la lista de dietas anterior.
//    -Se agregara un apartado nuevo al menú de "Gestión de pacientes" con las siguientes funcionalidades:
//      1- Dar de alta un paciente : Agregará un paciente nuevo a la lista de pacientes
//      2- Listar y Mostrar detalles de un paciente : Mostrará el detalle de un paciente así como todas sus dietas listadas de Lunes a domingo
//      3- Asignar una dieta: Muestra la lista de dietas general y puede asignarle una a un día de la semana del paciente.
//      4- Dar de baja un paciente: Elimina los datos de un paciente(No borra sus dietas asignadas dado que pueden estar asignadas a otro paciente)

import java.util.ArrayList;

public class Menu {


    private static ArrayList<Pet> petList;
    private static ArrayList<Diet> dietList;

    public static void main(String[] args) {
//        DietProgram program = new DietProgram();
//        program.showMenuProgram();
        startData();
    }


    public static void startData() {
        Pet pet4 = new Pet("Babe", "Pig", 55, 5, 18, 4);
        petList.add(pet4);
        Pet pet5 = new Pet("Shrek", "Ogre", 140, 30, 96, 2);
        petList.add(pet5);
        Pet pet0 = new Pet("Marcel", "Mono Capuchino", 2, 8, 34, 0);
        petList.add(pet0);
        Pet pet7 = new Pet("Simba", "León", 180, 2, 90, 4);
        petList.add(pet7);
        Pet pet8 = new Pet("Nemo", "Pez Payaso", 1, 1, 10, 0);
        petList.add(pet8);
        Pet pet9 = new Pet("Stitch", "Experimento 626", 30, 6, 60, 4);
        petList.add(pet9);
        Pet pet10 = new Pet("Manny", "Mamut", 4500, 45, 280, 4);
        petList.add(pet10);
        Pet pet11 = new Pet("Bambi", "Venado", 90, 2, 80, 4);
        petList.add(pet11);
        Intake intake1 = new Intake("Plátano", 27, 0, 1, 100);
        Intake intake2 = new Intake("Pollo", 0, 3, 27, 150);
        Intake intake3 = new Intake("Pescado", 0, 5, 26, 100);
        Intake intake4 = new Intake("Zanahoria", 10, 0, 1, 50);
        Intake intake5 = new Intake("Heno", 35, 3, 9, 200);
        Intake intake6 = new Intake("Manzana", 19, 0, 0, 120);
        Intake intake7 = new Intake("Pienso", 40, 12, 18, 200);
        Intake intake8 = new Intake("Lechuga", 5, 0, 1, 50);
        Intake intake9 = new Intake("Carne de Res", 0, 15, 26, 100);
        Intake intake10 = new Intake("Hierba", 3, 0, 1, 100);
        Intake intake11 = new Intake("Avena", 66, 7, 17, 100);
        Intake intake12 = new Intake("Huevo", 1, 5, 6, 50);
//TODO NECESITAMOS FOOD!!!!!!!!!!!!!!
        Diet diet1 = new Diet();
        diet1.setDietName("Dieta Estándar");
        diet1.getIntakes().add(intake1);
        diet1.getIntakes().add(intake2);
        diet1.getIntakes().add(intake3);

        Diet diet2 = new Diet(2000);
        diet2.setDietName("Dieta Vegetal baja en Calorias");
        diet2.getIntakes().add(intake4);
        diet2.getIntakes().add(intake5);
        diet2.getIntakes().add(intake6);

        Diet diet5 = new Diet(2000);
        diet5.setDietName("Dieta Carnivora baja en calorias");
        diet5.getIntakes().add(intake9);
        diet5.getIntakes().add(intake2);



        Diet diet3 = new Diet(200, 200, 200);
        diet3.setDietName("Dieta Equilibrada");
        diet3.getIntakes().add(intake7);
        diet3.getIntakes().add(intake8);
        diet3.getIntakes().add(intake9);

        Diet diet4 = new Diet(true, 30, 160, 60);
        diet4.setDietName("Dieta Personalizada");
        diet4.getIntakes().add(intake10);
        diet4.getIntakes().add(intake11);
        diet4.getIntakes().add(intake12);
        dietList.add(diet1);
        dietList.add(diet2);
        dietList.add(diet3);
        dietList.add(diet4);
        dietList.add(diet5);
    }

    public static ArrayList<Pet> getPetList() {
        return petList;
    }

    public static ArrayList<Diet> getDietList() {
        return dietList;
    }
}