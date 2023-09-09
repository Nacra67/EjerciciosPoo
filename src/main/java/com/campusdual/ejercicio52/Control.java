package com.campusdual.ejercicio52;

import java.util.ArrayList;

public class Control {
    public static void main(String[] args) {
//        Car uno = new Car("Seat","Leones","garage3",5);
//        Car uno = JsonImports.importCar(JsonImports.importFromJSONFile("Cars.json"));
//        for (int i = 0;i<20;i++){
//            uno.runing();
//            System.out.println("speed: "+ uno.getSpeed()+" distancia:" + uno.getDistance());
//        }
//        System.out.println(uno.jsonAddCar());
//        JsonImports.exportJSONToFile(uno.jsonAddCar());
        //////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////
        ArrayList<Car> carList = new ArrayList<Car>();

        for (Integer i =0; i<6;i++){
            carList.add(new Car(String.valueOf(i+10),String.valueOf(i)));
            System.out.println(carList.get(i).getSkill());

        }
        Garage garage = new Garage("El garaje de Manolo",carList);
        garage.setGarageName(garage.getGarageName());
        garage.garageInfo();

        ArrayList<Garage> listaGarages = new ArrayList<>();
        listaGarages.add(garage);
        StandarRace laCarrera = new StandarRace("Coruña Summer",120);
        laCarrera.addPlayers(listaGarages,garage.getCarList());
        laCarrera.startRace();
        //////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////

    }
}
