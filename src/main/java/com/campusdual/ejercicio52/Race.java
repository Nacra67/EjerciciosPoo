package com.campusdual.ejercicio52;

import java.util.ArrayList;

public class Race {
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
                "no se an comparado los coches se agregara un punto aleatorio\n" +
                "=====================================================");
        this.carsInRace.get(1).addPoints(3);

    }

}
