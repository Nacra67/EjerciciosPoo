package com.campusdual.ejercicio52;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.Random;

public class Car implements Interface1 {
    private String marca;
    private String modelo;
    private String garage;
    private Integer skill;
    private Double speed = 0.0;
    private Double distance = 0.0;
    private Integer points = 0;
    private final Integer MAX_SPEED = 110;



    public Car(String marca, String modelo, String garage, Integer skill) {
        this.marca = marca;
        this.modelo = modelo;
        this.garage = garage;
        this.skill = skill; //int 3 a 6
    }
    public Car(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        int numero = (int)(Math.random()*10+1);
        this.garage = "";
        this.skill = numero; //int 3 a 6 convertir en random
    }
    public  void carInfo(){
        System.out.println(this.marca + this.modelo+" de "+this.garage+ " va a "+Math.round(this.speed)+"km/h y lleva " +
                Math.round(this.distance)+"km recorridos");
    }
    public  void carPoints(){
        System.out.println(this.marca +"-"+ this.modelo+" Tiene: "+this.points+" puntos");
    }
    public void runing() {
        Random random = new Random();
        if (this.MAX_SPEED > this.speed) {
            int extraSpeed = random.nextInt(this.skill);
            this.speed = ((this.speed + 9 + extraSpeed) * 0.90);
            this.distance += this.speed/60;
        } else {
            int extraSpeed = random.nextInt(15-this.skill);
            this.speed -= extraSpeed;
            this.distance += this.speed/60;
        }
    }
    public void addPoints(Integer points){
        this.points += points;
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
    public void endRace(){
        setSpeed(0.0);
        setDistance(0.0);
    }
    public String getName(){
        return this.marca;
    }
    public void endTournament(){
        setPoints(0);
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
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }


}
