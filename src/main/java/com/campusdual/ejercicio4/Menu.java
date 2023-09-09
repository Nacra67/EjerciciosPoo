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
    public Menu() {
        this.myDiet = new Diet();
        this.foodList = new ArrayList<>();
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
    public int continuar(int select){
        System.out.println("___________________");
        System.out.println("1.Continuar");
        System.out.println("2.Exit");
        int selected = selection();
        if (selected != 1){
            System.out.println("Pues muerase de hambre!");
            return 4;
        }else {
            return select;
        }
    }
    public void menuPrincpal(){
        Integer select = 1;
        while (select !=4) {
            System.out.println("Opciones de Menu");
            System.out.println("-------------------------");
            System.out.println("1.Nueva Dieta");
            System.out.println("2.Informacion dieta actual");
            System.out.println("3.Añadir alimento a la dieta");
            System.out.println("4.Cerrar programa");
            System.out.println("--------------------------");
            System.out.println("Selecciona una de las opciones");
            select = selection();
            switch (select) {
                case 1:
                    newDiet();
                    select = continuar(select);
                    break;
                case 2:
                    dietInformation();
                    select = continuar(select);
                    break;
                case 3:
                    addNewElement();
                    select = myDiet.maxLimit(select);
                    select = continuar(select);
                    break;
                case 4:
                    System.out.println("Dieta finalizada, ¡esperamos volver a verle pronto!");
                    break;
                default:
                    System.out.println("algo no funciona");
            }
        }
        myDiet.getDietFood();
        System.out.println("Esperamos que disfrute su dieta!");

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
                alimentoRecomendado();
                break;
            default:
                System.out.println("Algo no funciona....");
        }
    }
    public void alimentoRecomendado(){
        System.out.println("selecciona tu alimento o cambia la cantidad:");
        for (int i = 0; i < this.foodList.size(); i++){
            int position = i + 1;
            System.out.print(position+"."+this.foodList.get(i).getNombre() + "  ");
        }
        Integer eleccion = selection();
        System.out.println("cuantos gramos ponemos?");
        Integer peso = selection();
        boolean contenido = false;
        for (int i = 0; i < myDiet.getDietFood().size(); i++){
            if (myDiet.getDietFood().get(i).getNombre() == this.foodList.get(eleccion-1).getNombre()){
                myDiet.getFoodWeight().set(i,peso);
                contenido = true;
                System.out.println("la cantidad de peso de "+this.foodList.get(eleccion-1).getNombre()+"  cambiada a" + peso + "g");
            }
        }
        if (!contenido){
            myDiet.addFood(this.foodList.get(eleccion-1),peso);
            System.out.println(this.foodList.get(eleccion-1).getNombre() + " alimento añadido");
        }
    }


    public void newAlimento(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alimento: ");
        String nombre = scanner.nextLine();
        Random random = new Random();
        int carbos = random.nextInt(31);
        int fats = random.nextInt(31);
        int proteins = random.nextInt(31);

        Food newAlimento= new Food(nombre, carbos, fats, proteins);
        System.out.println("cuantos gramos ponemos?");
        Integer peso = selection();
        boolean contenido = false;
        boolean contenido2 = false;
        for (int i = 0; i < myDiet.getDietFood().size(); i++){
            if (myDiet.getDietFood().get(i).getNombre() == newAlimento.getNombre()){
                myDiet.getFoodWeight().set(i,peso);
                contenido = true;
                System.out.println("la cantidad de peso de "+newAlimento.getNombre()+"  cambiada a" + peso + "g");
            }
        }
        for (int i = 0; i < foodList.size(); i++){
            if (foodList.get(i).getNombre() == newAlimento.getNombre()){
                contenido2 = true;
                System.out.println("esta comida ya esta incluida en nuestras recomendaciones");
            }
        }
        if (!contenido){
            myDiet.addFood(newAlimento,peso);
            System.out.println(newAlimento.getNombre() + " alimento añadido a dieta");
        }
        if (!contenido2){
            foodList.add(newAlimento);
            System.out.println(newAlimento.getNombre() + " alimento añadido a recomendaciones");
        }


    }


    public void newDiet(){
        System.out.println("Selecciona tu tipo de dieta!");
        System.out.println("1.Dieta PREMIUM sin limites!!!");
        System.out.println("2.Dieta con limite de Calorias");
        System.out.println("3.Dieta por Nutrientes");
        System.out.println("4.Dieta Basal PERSONALIZADA!!!");
        Integer tipoDieta = selection();
        switch (tipoDieta){
            case 1:
                myDiet = new Diet();
                break;
            case 2:
                System.out.println("MAXIMO DE CALORIAS!!");
                System.out.println("Diganos cuantas calorias desea como Maximo: ->");
                Integer maxCalories = selection();
                myDiet = new Diet(maxCalories);
                break;
            case 3:
                System.out.println("NUTRIENTES!!");
                System.out.println("Ingresa el valor para mxProtein:");
                Integer mxProtein = selection();
                System.out.println("Ingresa el valor para maxFats:");
                Integer maxFats = selection();
                System.out.println("Ingresa el valor para maxCarbs:");
                Integer maxCarbs = selection();
                myDiet = new Diet(mxProtein,maxFats,maxCarbs);
                break;
            case 4:
                System.out.println("(>Ò.ó)>-DIETA BASAL PERSONALIZAD-<(ò.Ó<)");
                System.out.println("Cual es tu genero? 1.Hombre 2.Mujer");
                Integer genero = selection();
                while(genero != 1 || genero != 2){
                    System.out.println("lo sentimos a ocurrido un error");
                    System.out.println("intentelo otra vez 1.Hombre 2.Mujer");
                    genero = selection();
                }
                System.out.println("Canto pesas? ò.Ó?");
                Integer peso = selection();
                System.out.println("E de alto como andas?");
                Integer alto = selection();
                System.out.println("Tu edad es lo que mas nos importa!");
                Integer edad = selection();
                this.myDiet = new Diet(genero,peso,edad,alto);
                break;
            default:
                System.out.println("Su dieta a fracasado, lo sentimos!");
        }
        System.out.println("\nSu nueva dieta a sido creada\n");
    }
    public void dietInformation(){
        this.myDiet.getFoodWeightList();
    }

}