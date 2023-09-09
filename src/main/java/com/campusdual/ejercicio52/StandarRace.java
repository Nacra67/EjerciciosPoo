package com.campusdual.ejercicio52;

public class StandarRace extends Race {
    public StandarRace(String raceName,Integer raceTime){
        super(raceName,raceTime);
    }
    public void startRace(){
        if (this.carsInRace != null){
            for (Integer i = 1;i<=this.raceTime;i++){
                if (i %30 == 0){
                    System.out.println("=================================\nllevamos "+i+" minutos de carrera");
                }
                for (Car car:this.carsInRace){

                    if (i %30 == 0){
                        car.carInfo();
                    }
                    car.runing();
                }
            }
            comparationCar();
            for (Car car:this.carsInRace){
                car.carPoints();
            }
        } else {
            System.out.println("algo va mal con el startRace - standar, no tenemos pilotos en la parrilla");
        }


    }
}
