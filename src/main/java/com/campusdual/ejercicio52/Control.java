package com.campusdual.ejercicio52;

public class Control {
    public static void main(String[] args) {
//        Car uno = new Car("Seat","Leones","garage3",5);
        Car uno = JsonImports.importCar(JsonImports.importFromJSONFile("Cars.json"));
        for (int i = 0;i<20;i++){
            uno.runing();
            System.out.println("speed: "+ uno.getSpeed()+" distancia:" + uno.getDistance());
        }
//        System.out.println(uno.jsonAddCar());
//        JsonImports.exportJSONToFile(uno.jsonAddCar());
    }
}
