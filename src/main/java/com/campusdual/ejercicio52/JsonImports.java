package com.campusdual.ejercicio52;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;

public class JsonImports {

    public static void exportJSONToFile(JSONObject obj) {
        try (FileWriter w = new FileWriter("Cars.json")) {
            w.write(obj.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static JSONObject importFromJSONFile(String filename) {
        try (FileReader r = new FileReader(filename)) {
            JSONParser parser = new JSONParser();
            return (JSONObject) parser.parse(r);
        } catch (Exception e) {
            return null;
        }
    }

    public static Car importCar(JSONObject obj) {
        String model = (String) obj.get("marca");
        String brand = (String) obj.get("modelo");
        String garage = (String) obj.get("garage");
        Long skill = (Long) obj.get("skill");
        return new Car(brand, model, garage, skill.intValue());

    }
}
