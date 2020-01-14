package com.view;

import com.controller.ControllerAccueil;

import java.util.ArrayList;
import java.util.Scanner;

public class VueAccueil {

    private ControllerAccueil controllerAccueil;

    public VueAccueil(ControllerAccueil controllerAccueil) {
        this.controllerAccueil = controllerAccueil;
    }

    public void Affichage() {
        Scanner objetEntree =new Scanner(System.in);

        ArrayList<String> listeActions = new ArrayList<>();

        listeActions.add("Ajouter une candidature");
        listeActions.add("Voir les candidatures");
        listeActions.add("Voir les bourses");
        listeActions.add("Fermer l'application");

        String output = "";
        output = "Bienvenue sur PolyBourse, l'application qui permet de gérer les demandes de bourses Erasmus des élèves de Polytech\n  Que souhaitez-vous faire ?\n\n";

        for(int i = 0; i<listeActions.size(); i++) {
            output += "  " +(i + 1) +" - " + listeActions.get(i) +"\n";
        }

        output += "Veuillez entrer le numéro correspondant à votre choix (exemple : 1) :";
        System.out.println(output);

        String stringAction = "";
        int intAction = 0;

        while(intAction <= 0 || intAction > listeActions.size()) {
            stringAction = objetEntree.nextLine();
            try {
                intAction = Integer.parseInt(stringAction);
                if(intAction <= 0 || intAction > listeActions.size()) {
                    System.out.println("Erreur ! Il faut entrer un nombre valide (exemple : 1) !");
                }
            }catch (Exception e) {
                System.out.println("Erreur ! Il faut entrer un nombre valide (exemple : 1) !");
            }
        }

        System.out.println("Vous avez choisi : " + listeActions.get(intAction -1));

        this.controllerAccueil.RenvoyerVers(intAction);

    }
}
