package com.campusdual.ejercicio4;

public class Food {
    private String nombre;
    private Integer carbos;
    private Integer fats;
    private Integer proteins;

//    public Food(){
//        this.nombre="";
//        this.carbos=0;
//        this.fats=0;
//        this.proteins=0;
//    }

    public Food(String nombre ,Integer carbos,Integer fats, Integer proteins){
        this.nombre = nombre;
        this.carbos=carbos;
        this.fats=fats;
        this.proteins=proteins;
    }

    public Integer getCalories(Integer weight){
        //1 gramo de proteína nos da 4 calorías.
        // 1 gramo de carbohidratos nos da 4 calorías.
        // 1 gramo de grasa nos da 9 calorías
        return(((carbos*4)+(fats*9)+(proteins*4))*weight/100);
    }
    public Integer getCarbos() {
        return carbos;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getFats() {
        return fats;
    }


    public Integer getProteins() {
        return proteins;
    }

}