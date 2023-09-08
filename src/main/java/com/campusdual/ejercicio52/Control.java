package com.campusdual.ejercicio52;

public class Control {
    public static void main(String[] args) {
        Car uno = new Car("Seat","Leon","garage1",5);
//        for (int i = 0;i<20;i++){
//            uno.runing();
//            System.out.println("speed: "+ uno.speed+" distancia:" + uno.distance);
//        }
        System.out.println(uno.jsonAddCar());
        uno.exportJSONToFile(uno.jsonAddCar());
    }
}
