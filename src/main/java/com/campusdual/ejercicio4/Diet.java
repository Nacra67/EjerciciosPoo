package com.campusdual.ejercicio4;

import java.util.ArrayList;

/*
* Escribe una clase dieta, que teniendo en cuenta una serie de alimentos, vaya sumando cantidades en
*   gramos y calcule cuentas calorías, carbohidratos, proteinas y grasas genera la ingesta
La clase dieta tiene que tener las siguientes funcionalidades:
	-Diet(): crea una dieta sin límite de calorías
	-Diet(Integer maxCalories): crea una dieta con un máximo de calorías, en cuanto se supera
	*   ese máximo cuando se adjunta un alimento se despliega un error
	-Diet(Integer maxFats, Integer maxCarbs, Integer maxProtein): crea una dieta con un máximo
	*   de estos tres valores, si se supera alguno de ellos cuando se adjunta un alimento se
	*   indicara cual y desplegará un error
	-Diet(Boolean women, Integer age, Integer height, Integer weight): Calcula el metabolismo
	*   basal de la persona y lo asigna como máximo de calorías en la dieta
		--CALCULAR METABOLISMO BASAL
			E = edad
			A = altura en centímetros
			P = peso en kilos

			Fórmula Hombres: TMB = 10P + 6,25A – 5E + 5
			Fórmula Mujeres: TMB = 10P + 6,25A – 5E – 161
	-addFood(Food,Integer): agrega un alimento y una cantidad en gramos
	-getTotalCalories(): devuelve el total de calorías
	-getTotalCarbs(): devuelve el total de carbohidratos
	-getTotalFats(): devuelve el total de grasas
	-getTotalProtein(): devuelve el total de proteinas
*
* */
public class Diet {

    private ArrayList<Food> dietFood;
    private ArrayList<Integer> foodWeight;

    public Diet() {
        this.dietFood = new ArrayList<Food>();
        this.foodWeight = new ArrayList<Integer>();
    }
    public void addFood(Food food, Integer weight){
        this.dietFood.add(food);
        this.foodWeight.add(weight);
    }
    public double getCalories(){
        double totalCalories = 0;
        for (int i=0 ; i < this.dietFood.size(); i++){
            totalCalories += this.dietFood.get(i).getCalories(this.foodWeight.get(i));
        }
        return totalCalories;
    }

    public double getTotalCarbs(){
        double totalCarbs =0;
        for (int i=0 ; i < this.dietFood.size(); i++){
            totalCarbs += this.dietFood.get(i).getCarbos() * this.foodWeight.get(i)/100;
        }

        return totalCarbs;
    }

    public double getTotalFats(){
        double totalFats =0;
        for (int i=0 ; i < this.dietFood.size(); i++){
            totalFats += this.dietFood.get(i).getFats() * this.foodWeight.get(i)/100;
        }

        return totalFats;
    }

    public double getTotalProteins(){
        double totalProteins =0;
        for (int i=0 ; i < this.dietFood.size(); i++){
            totalProteins += this.dietFood.get(i).getProteins() * this.foodWeight.get(i)/100;
        }

        return totalProteins;
    }
    public void getFoodWeightList(){
        System.out.println("________________");
        System.out.println("___SU DIETA___");
        for (int i = 0; i < dietFood.size(); i++){
            System.out.print(dietFood.get(i).getNombre()+"-"+foodWeight.get(i) + "g ");
        }
        System.out.println("\n");
        System.out.println("Valores nutricionales:");
        System.out.print("Cantidad de carbos:");
        System.out.println(getTotalCarbs());
        System.out.print("Cantidad de protes:");
        System.out.println(getTotalProteins());
        System.out.print("Cantidad de grasas:");
        System.out.println(getTotalFats());
        System.out.print("Total de calorias:");
        System.out.println(getCalories());
    }
}
