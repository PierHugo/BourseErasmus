package com.view;

import com.controller.ControllerAfficherCandidatures;

import java.util.Scanner;

public class VueAfficherCandidature {

    private ControllerAfficherCandidatures controllerAfficherCandidatures;

    public VueAfficherCandidature (ControllerAfficherCandidatures controllerAfficherCandidatures) {
        this.controllerAfficherCandidatures = controllerAfficherCandidatures;
    }

    public void Affichage() {
        Scanner objetEntree = new Scanner(System.in);
        String output = "";
        String stringAction = "";
        int intAction = 0;
//        output = "De quel étudiant voulez-vous afficher les candidatures ?\n";
//        output += "Nom :\n";
//        System.out.println(output);
//        output += "Prénom :\n";
//        output += "Numéro étudiant :\n";
        System.out.println("Voici la liste de toutes les candidatures à ce jour :\n");
        controllerAfficherCandidatures.getControllerMain().getAllCandidatures();

    }
}
