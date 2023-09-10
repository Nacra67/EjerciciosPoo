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
    }

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
                    Kb.enterContinuar("sin informacion");
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
    }

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
                break;
            default:
                Kb.enterContinuar("Volviendo al menu principal");
        }
    }

    public void showTournaments() {
        System.out.println("Seleccione el torneo que quiere organizar:");
        for (Integer i = 0; i < this.tournaments.size(); i++) {
            System.out.println((i + 1) + ".-" + this.tournaments.get(i).getTournamentName());
        }
        Integer seleccion = Kb.sureNextInt();
        this.actualTournament = this.tournaments.get(seleccion-1);

        Kb.enterContinuar("Ha seleccionado el " + this.actualTournament.getTournamentName());
        actualTournament.tournamentMainMenu();
    }

}
