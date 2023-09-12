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
    private static ArrayList<Food> foodList;

    public static void main(String[] args) {
//        DietProgram program = new DietProgram();
//        program.showMenuProgram();
        startData();
        showData(55);
        mainMenu();
    }


    public static void startData() {
        petList = new ArrayList<>();
        dietList= new ArrayList<>();
        foodList= new ArrayList<>();
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

        Food food1 = new Food("Plátano", 27, 0, 1);
        foodList.add(food1);
        Food food2 = new Food("Pollo", 0, 3, 27);
        foodList.add(food2);
        Food food3 = new Food("Pescado", 0, 5, 26);
        foodList.add(food3);
        Food food4 = new Food("Zanahoria", 10, 0, 1);
        foodList.add(food4);
        Food food5 = new Food("Heno", 35, 3, 9);
        foodList.add(food5);
        Food food6 = new Food("Manzana", 19, 0, 0);
        foodList.add(food6);
        Food food7 = new Food("Pienso", 40, 12, 18);
        foodList.add(food7);
        Food food8 = new Food("Lechuga", 5, 0, 1);
        foodList.add(food8);
        Food food9 = new Food("Carne de Res", 0, 15, 26);
        foodList.add(food9);
        Food food10 = new Food("Hierba", 3, 0, 1);
        foodList.add(food10);
        Food food11 = new Food("Avena", 66, 7, 17);
        foodList.add(food11);
        Food food12 = new Food("Huevo", 1, 5, 6);
        foodList.add(food12);

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
    public static void showData(Integer select) {
        Integer count = 0;
        if (select == 1) {
            System.out.println("\n Lista de mascottas");
            for (Pet pet : petList) {
                count++;
                System.out.println(count + ".-Nomber: " + pet.getName() + " Especie: " + pet.getSpecies());
            }

        } else if (select == 2) {
            System.out.println("\n Lista de Dietas");
            for (Diet diet : dietList) {
                count++;
                System.out.println(count + ".-Dieta: " + diet.getDietName());


            }
        } else if (select == 3) {
            System.out.println("\n Lista de alimentos");
            for (Food food : foodList) {
                count++;
                System.out.println(count + ".-alimento-> " + food.getName());

            }

        } else {
            System.out.println("\n Lista de Mascotas");
            for (Pet pet : petList) {
                count++;
                System.out.println(count + ".-Nomber: " + pet.getName() + " Especie: " + pet.getSpecies());
            }count = 0;
            System.out.println("\n Lista Dietas");
            for (Diet diet : dietList) {
                count++;
                System.out.println(count + ".-Dieta: " + diet.getDietName());
            }count = 0;
            System.out.println("\n Lista de alimentos");
            for (Food food : foodList) {
                count++;
                System.out.println(count + ".-alimento-> " + food.getName());
            }

        }


    }
    public static void mainMenu(){
        System.out.println("       .__  .__       .__                              __               .__                    .__        \n" +
                "  ____ |  | |__| ____ |__| ____ _____    ___  __ _____/  |_  ___________|__| ____ _____ _______|__|____   \n" +
                "_/ ___\\|  | |  |/    \\|  |/ ___\\\\__  \\   \\  \\/ // __ \\   __\\/ __ \\_  __ \\  |/    \\\\__  \\\\_  __ \\  \\__  \\  \n" +
                "\\  \\___|  |_|  |   |  \\  \\  \\___ / __ \\_  \\   /\\  ___/|  | \\  ___/|  | \\/  |   |  \\/ __ \\|  | \\/  |/ __ \\_\n" +
                " \\___  >____/__|___|  /__|\\___  >____  /   \\_/  \\___  >__|  \\___  >__|  |__|___|  (____  /__|  |__(____  /\n" +
                "     \\/             \\/        \\/     \\/             \\/          \\/              \\/     \\/              \\/\n" +
                "  / /_         .---.\n" +
                " / | \\\\,.\\/--.//    )\n" +
                " |  \\//        )/  / \n" +
                "  \\  ' ^ ^    /    )____.----..  6\n" +
                "   '.____.    .___/            \\._) \n" +
                "      .\\/.                      )\n" +
                "       '\\                       /\n" +
                "       _/ \\/    ).        )    (\n" +
                "      /#  .!    |        /\\    /\n" +
                "      \\  C// #  /'-----''/ #  / \n" +
                "   .   'C/ |    |    |   |    |mrf  ,\n" +
                "   \\), .. .'OOO-'. ..'OOO'OOO-'. ..\\(Art by Morfina");
        System.out.println("########################################################");
        System.out.println("################# Programa de dietas ###################");
        System.out.println("########################################################");


    }

    public static ArrayList<Pet> getPetList() {
        return petList;
    }

    public static ArrayList<Diet> getDietList() {
        return dietList;
    }

    public static void setPetList(ArrayList<Pet> petList) {
        Menu.petList = petList;
    }

    public static void setDietList(ArrayList<Diet> dietList) {
        Menu.dietList = dietList;
    }

    public static ArrayList<Food> getFoodList() {
        return foodList;
    }

    public static void setFoodList(ArrayList<Food> foodList) {
        Menu.foodList = foodList;
    }
}