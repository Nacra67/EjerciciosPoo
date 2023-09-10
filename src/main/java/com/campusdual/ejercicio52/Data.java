package com.campusdual.ejercicio52;

import org.json.simple.JSONArray;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Car> generalCarList = new ArrayList<>();
    private static ArrayList<Garage> generalGarageList = new ArrayList<>();
    private static ArrayList<Tournament> generalTournamentList = new ArrayList<>();
    private static ArrayList<Race> generalRaceList = new ArrayList<>();

    public static void startData(){

        //CARS
        for (Integer i =0; i<6;i++){
            generalCarList.add(new Car(String.valueOf(i+10),String.valueOf(i)));
            System.out.println(generalCarList.get(i).getSkill());

        }

        //GARAGES
        Garage garage = new Garage("El garaje de Manolo",generalCarList);
        garage.setGarageName(garage.getGarageName());
        generalGarageList.add(garage);

        //RACE
        StandarRace laCarrera = new StandarRace("Coruña Summer",120);
        generalRaceList.add(laCarrera);

        //TOURNAMETS
        Tournament torneo0 = new Tournament("Torneo Galego");
        Tournament torneo1 = new Tournament("Torneo Asturiano");
        Tournament torneo2 = new Tournament("Torneo Intercontinental");
        Tournament torneo3 = new Tournament("Torneo Galactico");
        generalTournamentList.add(torneo0);
        generalTournamentList.add(torneo1);
        generalTournamentList.add(torneo2);
        generalTournamentList.add(torneo3);


    }
    public static void startData(JSONArray jsonArray){

    }

    public static ArrayList<Car> getGeneralCarList() {
        return generalCarList;
    }

    public static void setGeneralCarList(ArrayList<Car> generalCarList) {
        Data.generalCarList = generalCarList;
    }

    public static ArrayList<Garage> getGeneralGarageList() {
        return generalGarageList;
    }

    public static void setGeneralGarageList(ArrayList<Garage> generalGarageList) {
        Data.generalGarageList = generalGarageList;
    }

    public static ArrayList<Tournament> getGeneralTournamentList() {
        return generalTournamentList;
    }

    public static void setGeneralTournamentList(ArrayList<Tournament> generalTournamentList) {
        Data.generalTournamentList = generalTournamentList;
    }

    public static ArrayList<Race> getGeneralRaceList() {
        return generalRaceList;
    }

    public static void setGeneralRaceList(ArrayList<Race> generalRaceList) {
        Data.generalRaceList = generalRaceList;
    }
}
