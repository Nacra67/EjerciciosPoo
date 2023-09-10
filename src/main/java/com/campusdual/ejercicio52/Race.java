package com.campusdual.ejercicio52;

import java.util.ArrayList;

public abstract class Race implements Interface1 {
    protected String raceName;
    protected ArrayList<Garage> garagesInRace;
    protected ArrayList<Car> carsInRace;
    protected Integer raceTime;
    //añadir garaje
        //añadir coches
            //todos os coches de un garaje
            //un coche aleatorio por cada garaje
    //podio
    public Race(String raceName, Integer raceTime){
        this.raceName = raceName;
        this.raceTime = raceTime;

    }
    public void addPlayers(ArrayList<Garage> garagesInRace,ArrayList<Car> carsInRace){
        this.carsInRace = carsInRace;
        this.garagesInRace = garagesInRace;


    }
    public void comparationCar(){
        System.out.println("=====================================================\n" +
                "no se han comparado los coches se agregará un punto aleatorio\n" +
                "=====================================================");
        this.carsInRace.get(1).addPoints(3);

    }
    public String getName(){
        return this.raceName;
    }

}
