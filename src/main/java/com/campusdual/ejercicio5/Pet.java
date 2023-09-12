package com.campusdual.ejercicio5;

import java.util.ArrayList;

//  -Se pueden dar de alta personas: Las personas tendrán los siguientes atributos: nombre, apellidos, peso, altura, edad y sexo.
//    -Las personas podrán tener asignadas una lista de dietas que se catalogarán de lunes a domingo sacadas de la lista de dietas anterior.
//    -Se agregara un apartado nuevo al menú de "Gestión de pacientes" con las siguientes funcionalidades:
//      1- Dar de alta un paciente : Agregará un paciente nuevo a la lista de pacientes
//      2- Listar y Mostrar detalles de un paciente : Mostrará el detalle de un paciente así como todas sus dietas listadas de Lunes a domingo
//      3- Asignar una dieta: Muestra la lista de dietas general y puede asignarle una a un día de la semana del paciente.
//      4- Dar de baja un paciente: Elimina los datos de un paciente(No borra sus dietas asignadas dado que pueden estar asignadas a otro paciente)
public class Pet {
    private String name;
    private String species;
    private Integer weight;
    private Integer age;
    private Integer ownerID;
    private Integer sex;
    private ArrayList<Diet> weekDiets;

    public Pet(){

    }
    public Pet(String name, String species, Integer weight, Integer age, Integer ownerID, Integer sex) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.age = age;
        this.ownerID = ownerID;
        this.sex = sex;
        this.weekDiets = null;
    }
    public void setAll(){
        //TODO setes con Kb de atributos
        System.out.println("pet sin atributos creada (pendiente)");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Integer ownerID) {
        this.ownerID = ownerID;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public ArrayList<Diet> getWeekDiets() {
        return weekDiets;
    }

    public void setWeekDiets(ArrayList<Diet> weekDiets) {
        this.weekDiets = weekDiets;
    }
}