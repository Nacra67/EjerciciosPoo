package com.campusdual.ejercicio52;

import java.util.ArrayList;

public class Tournament implements Interface1 {
    private String tournamentName;
    private ArrayList<Race> tournamentRaceList;
    private ArrayList<Garage> tournamentGarageList;
    private ArrayList<Car> tournamentCarList;

    public Tournament(String tournamentName) {
        this.tournamentName = tournamentName;

    }

    public void tournamentMainMenu() {
        Integer selection;
        do {

            System.out.println("──Menu del Torneo──\n" +
                    "──"+this.tournamentName+"──\n" +
                    "1.-Iniciar Torneo\n" +
                    "2.-Informacion del Torneo\n" +
                    "3.-Gestionar Participantes\n" +
                    "4.-Gestionar Carreras\n" +
                    "5.-Volver al menu principal");
            selection = Kb.sureNextInt();
            switch (selection) {
                case 1:
                    Kb.enterContinuar("pendiente de implementar");
                    break;
                case 2:
                    Kb.enterContinuar("pendiente de implementar");
                    break;
                case 3:
                    controlDeParticipantes();
                    break;
                case 4:
                    Kb.enterContinuar("pendiente de implementar");
                    break;
                case 5:
                    System.out.println("_________________");
                    break;
                default:
                    System.out.println("error tournamentMainMenu");
                    break;
            }

        } while (selection != 5);
    }

    public void controlDeParticipantes() {
        Integer selection;
            if (tournamentCarList == null) {
                System.out.println("Aun no hay participantes en la carrera\n" +
                        "escoge una opcion:\n" +
                        "1.-Un Garage - Participaran todos sus pilotos\n" +
                        "2.-Mix Garages - Participara un piloto aleatorio de acada garaje\n" +
                        "3.-Atras");
                selection = Kb.sureNextInt();
                switch (selection){
                    case 1:
                        System.out.println("Control de particiantes caso1 pueba .get(0)");
                        Garage garage = Data.getGeneralGarageList().get(0);
                        this.tournamentGarageList = new ArrayList<>();
                        this.tournamentGarageList.add(garage);
                        tournamentGarageList.get(0).garageInfo();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                }
            }else{
            }
            Kb.enterContinuar("controlDeParticipantes");
    }
    public String getName(){
        return this.tournamentName;
    }
    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public ArrayList<Race> getTournamentRaceList() {
        return tournamentRaceList;
    }

    public void setTournamentRaceList(ArrayList<Race> tournamentRaceList) {
        this.tournamentRaceList = tournamentRaceList;
    }

    public ArrayList<Garage> getTournamentGarageList() {
        return tournamentGarageList;
    }

    public void setTournamentGarageList(ArrayList<Garage> tournamentGarageList) {
        this.tournamentGarageList = tournamentGarageList;
    }

    public ArrayList<Car> getTournamentCarList() {
        return tournamentCarList;
    }

    public void setTournamentCarList(ArrayList<Car> tournamentCarList) {
        this.tournamentCarList = tournamentCarList;
    }
}
