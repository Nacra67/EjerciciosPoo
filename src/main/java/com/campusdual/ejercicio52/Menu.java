package com.campusdual.ejercicio52;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Tournament> tournaments;
    private Tournament actualTournament;
    private String line = "───────────────────";

    public Menu() {
        Data.startData();
        this.tournaments = Data.getGeneralTournamentList();
    }

    public void startMenu() {
        System.out.println("───────▄▄▄▄▄▄──────────\n" +
                "────▄▄██┌┐█┌┐█▄▄▄▄─────\n" +
                "────██████████████─────\n" +
                "────▀▀◯▀▀▀▀▀▀▀▀◯▀──────\n" +
                "─────RACE─CONTROL!─────");
        startMainMenu();
    }//startMainMenu

    public void startMainMenu() {
        Integer selection;
        do {
            System.out.println("=======================\n" +
                    "==SELECCIONAR ACCION===\n" +
                    "1.-Organizar Torneo\n" +
                    "2.-Mostrar Informacion(test)\n" +
                    "3.-Modificar(test)\n" +
                    "4.-Salir\n" +
                    ":...");
            selection = Kb.sureNextInt();
            switch (selection) {
                case 1:
                    organizarTorneo();
                    break;
                case 2:
                    mostrarInformacion();
                    break;
                case 3:
                    Kb.enterContinuar("Modificaciones en construccion");
                    break;
                case 4:
                    System.out.println("\n\nfinalizando programa (pendiente guardado)");
                    break;
                default:
                    Kb.enterContinuar("DEFAULT - Menu/startMainMenu");
                    break;
            }

        } while (selection != 4);
        System.out.println(".....programa finalizado");
    }//1de4

    public void organizarTorneo() {
        Integer selection;
        System.out.println("=======================\n" +
                "1.-Escoger Torneo\n" +
                "2.-Nuevo Torneo (en construccion)\n" +
                "3.-Atras\n" +
                ":...");
        selection = Kb.sureNextInt();
        switch (selection) {
            case 1:
                showTournaments();
                //lista a seleccionar

                break;
            case 2:
                newTournament();
                Kb.enterContinuar("Entrando al menu del nuevo torneo");
                actualTournament.tournamentMainMenu();
                break;
            default:
                Kb.enterContinuar("Volviendo al menu principal");
        }
    }//salto a ()ShowTournaments //salto a newTournament()
    public void newTournament(){
        String tournamentName = Kb.nextLine("Escrive el nombre del torneo");
        Tournament tournament = new Tournament(tournamentName);
        Data.getGeneralTournamentList().add(tournament);
        this.actualTournament = tournament;

    }////Salto a actualTournament.tournamentMainMenu()

    public void showTournaments() {
        System.out.println("Seleccione el torneo que quiere organizar:");
        for (Integer i = 0; i < this.tournaments.size(); i++) {
            System.out.println((i + 1) + ".-" + this.tournaments.get(i).getTournamentName());
        }
        Integer seleccion = Kb.sureNextInt();
        this.actualTournament = this.tournaments.get(seleccion-1);

        Kb.enterContinuar("Ha seleccionado el " + this.actualTournament.getTournamentName());
        actualTournament.tournamentMainMenu();
    }//Salto a actualTournament.tournamentMainMenu()
    public void mostrarInformacion(){
        Integer selection;
        do {
            System.out.println("=======================\n" +
                    "==SELECCIONAR ACCION===\n" +
                    "1.-Informacion de Coches\n" +
                    "2.-Informacion de Garages\n" +
                    "3.-Informacion de Carreras\n" +
                    "4.-Informacion de Torneos\n" +
                    "5.-SALIR" +
                    ":...");
            selection = Kb.sureNextInt();
            if(selection< 5) {
                Data.showList(selection);
                Kb.enterContinuar("-------");
            }
        } while (selection != 5);

    }
    public void modificar(){

    }
}
