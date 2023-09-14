package com.campusdual.ejercicio5;

public enum Days {
    L(0,"Lunes"),
    M(1,"Martes"),
    X(2,"Míercoles"),
    J(3,"Jueves"),
    V(4,"Viernes"),
    S(5,"Sábado"),
    D(6,"Domingo");

    private Integer position;
    private String name;

    Days(Integer position, String name) {
        this.position = position;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Integer getPosition(){
        return position;
    }

    public static Days getDayFromPosition(Integer position){
        for(Days day : values()){
            if(day.getPosition()==position){
                return day;
            }
        }
        return null;
    }
}