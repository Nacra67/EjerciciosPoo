package com.campusdual.ejercicio5;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SaveInfo {

    public static void savePet(Pet pet){//sobrescribe pet

        File writeFile = new File("src/main/resources/pets.txt");
        try (PrintWriter pw = new PrintWriter(new FileWriter(writeFile))) {
            pw.println(pet.patientToString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void addPet(Pet pet){//añade pets atributo True en FileWriter

        File writeFile = new File("src/main/resources/pets.txt");
        try (PrintWriter pw = new PrintWriter(new FileWriter(writeFile,true))) {
            pw.println(pet.patientToString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void petsToList(ArrayList<Pet> petList){


    }
}
