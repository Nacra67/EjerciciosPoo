package com.campusdual.ejercicio4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
* --Escribe un programa que utilice la clase Dieta y despliegue un menú donde puedas añadir alimentos. El menú tendrá las siguientes opciones.
	-1. Crear/reiniciar dieta: crea o remplaza la dieta inicial
		-a. Sin limite
		-b. Por calorías
		-c. Por macronutrientes
		-d. Por datos personales
	-2. Mostrar información: muestra calorías y macronutrientes de la dieta
	-3. Agregar alimento: agrega un alimento a la dieta actual y añade ese alimento a la lista de alimentos disponible
		-a. Nuevo alimento
		-b. Alimento existente
	-4. Salir
* */
public class Menu {

    private Diet myDiet;
    private ArrayList<Food> foodList;
    private int count;
    public Menu() {
        this.myDiet = new Diet();
        this.foodList = new ArrayList<>();
        this.count = 0;
    }
    public void cargarAlimentos(){
        Food manzana = new Food("Manzana",5,5,5);
        foodList.add(manzana);
        Food pinha = new Food("Piña",5,5,5);
        foodList.add(pinha);
        Food chuleton = new Food("Chuleton",5,5,5);
        foodList.add(chuleton);
        Food percebes = new Food("Percebes",5,5,5);
        foodList.add(percebes);
        Food aceitunas = new Food("Aceitunas",5,5,5);
        foodList.add(aceitunas);
        Food guiso = new Food("Guiso de pato",5,5,5);
        foodList.add(guiso);
        Food atun = new Food("Atun",5,5,5);
        foodList.add(atun);
        Food pasta = new Food("Pasta",5,5,5);
        foodList.add(pasta);

    }
    public static Integer selection(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    public void continuar(){
        System.out.println("___________________");
        System.out.println("1.Continuar");
        System.out.println("2.Exit");
        if (selection() == 1){
            menuPrincpal();
        }else {
            System.out.println("Pues muerase de hambre!");
        }
    }
    public void menuPrincpal(){
        System.out.println("Opciones de Menu");
        System.out.println("-------------------------");
        System.out.println("1.Nueva Dieta");
        System.out.println("2.Informacion dieta actual");
        System.out.println("3.Añadir alimento a la dieta");
        System.out.println("4.Cerrar programa");
        System.out.println("--------------------------");
        System.out.println("Selecciona una de las opciones");
        Integer select = selection();
        switch (select){
            case 1:
                newDiet();
                break;
            case 2:
                dietInformation();
                break;
            case 3:
                addNewElement();
                continuar();
                break;
            case 4:
                System.out.println("Dieta finalizada, ¡esperamos volver a verle pronto!");
                break;
        }
        count += 1;
        System.out.println(count);
    }
    public void addNewElement(){
        System.out.println("Añadir alimento:");
        System.out.println("   1.Alimento nuevo");
        System.out.println("   2.Alimento recomendado");
        System.out.println("selcciona opciones 1 o 2");
        switch (selection()){
            case 1:
                newAlimento();
                break;
            case 2:
                break;
            default:
                System.out.println("Algo no funciona....");
        }
    }
    public void newAlimento(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alimento: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa la cantidad del alimento: ");
        int weight = scanner.nextInt();

        Random random = new Random();
        int carbos = random.nextInt(31);
        int fats = random.nextInt(31);
        int proteins = random.nextInt(31);

        Food newAlimento= new Food(nombre, carbos, fats, proteins);
        this.foodList.add(newAlimento);
        this.myDiet.addFood(newAlimento,weight);

        System.out.println("Sus "+weight+ " de "+nombre+" han sido añadido a la dieta");

    }
    public void newDiet(){
        System.out.println("\n\n\nSu nueva dieta a sido creado\n");
        this.myDiet = new Diet();
        continuar();
    }
    public void dietInformation(){
        this.myDiet.getFoodWeightList();
        continuar();
    }

}