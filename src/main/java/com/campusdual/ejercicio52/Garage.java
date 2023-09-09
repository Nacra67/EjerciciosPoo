package com.campusdual.ejercicio52;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> carList;
    private String garageName;

    public Garage(String garageName){
        this.garageName = garageName;
        this.carList = new ArrayList<Car>();
    }
    public Garage(String garageName,ArrayList<Car> carList){
        this.garageName = garageName;
        this.carList = carList;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public String getGarageName() {
        return garageName;
    }

    public void setGarageName(String garageName) {

        //AÑADIR: comprobar nombre de garage xa usado
        this.garageName = garageName;
        for(Car car:this.carList){
            car.setGarage(garageName);
        }
    }
    public void garageInfo(){
        System.out.println(this.garageName);
        for (Car car:this.carList){
            car.carPoints();
        }
    }

    public void addCarToGarage(Car car){
        if (car.getGarage() == ""){
            carList.add(car);
        }else{
            addCarToGarage(car,car.getGarage());
        }

    }
    public void addCarToGarage(Car car, String oldGarage){
        System.out.println("aqui falta implementar borrar car de garage anterior pa añadir a novo");
    }
}
