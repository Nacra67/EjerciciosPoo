package com.campusdual.ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
//        Diet myDiet;
//        Food manzana = new Food("Manzana",5,5,5);
//        Diet frutivora = new Diet();
//        frutivora.addFood(manzana,100);
//
//        frutivora.getTotalCalories();
//        frutivora.getTotalCarbos();
//        frutivora.getTotalFats();
//        frutivora.getTotalProteins();



//        Menu.menuPrincpal(myDiet = new Diet());
        Menu menu = new Menu();
        menu.cargarAlimentos();
        menu.menuPrincpal();

    }
}
