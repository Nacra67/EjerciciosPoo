package com.campusdual.ejercicio52;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.Random;

public class Car {
    private String marca;
    private String modelo;
    private String garage;
    private Integer skill;
    private Double speed;
    private Double distance;
    private final Integer MAX_SPEED = 100;

    public Car(String marca, String modelo, String garage, Integer skill) {
        this.marca = marca;
        this.modelo = modelo;
        this.garage = garage;
        this.speed = 0.0;
        this.skill = skill; //int 3 a 6
        this.distance = 0.0;

    }
    public  void carInfo(){
        System.out.println(this.marca +"-"+ this.modelo+" va a "+this.speed+"m/min y lleva " +
                this.distance+"m recorridos");
    }
    public void runing() {
        Random random = new Random();
        if (this.MAX_SPEED > this.speed) {
            System.out.println("acelera");
            int extraSpeed = random.nextInt(this.skill);
            this.speed = ((this.speed + 13 + extraSpeed) * 0.90);
            this.distance += this.speed;
        } else {
            System.out.println("decelera");
            int extraSpeed = random.nextInt(15-this.skill);
            this.speed -= extraSpeed;
            this.distance += this.speed;
        }
    }

    public JSONObject jsonAddCar(){
        JSONObject car = new JSONObject();
        car.put("marca",this.marca);
        car.put("modelo",this.modelo);
        car.put("garage",this.garage);
        car.put("skill",this.skill);
        return car;
    }
    public static void exportJSONToFile(JSONObject obj) {
        try (FileWriter w = new FileWriter("Cars.json")) {
            w.write(obj.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getGarage() {
        return garage;
    }

    public Integer getSkill() {
        return skill;
    }

    public Double getSpeed() {
        return speed;
    }

    public Double getDistance() {
        return distance;
    }
}
