package com.view;

import com.controller.ControllerAfficherEcoles;
import com.model.Ecole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VueAfficherEcole
{

    private ControllerAfficherEcoles controllerAfficherEcoles;

    public VueAfficherEcole(ControllerAfficherEcoles controllerAfficherEcoles)
    {
        this.controllerAfficherEcoles = controllerAfficherEcoles;
    }

    public void Affichage()
    {
        Scanner objetEntree = new Scanner(System.in);

        System.out.println("Voici la liste de toutes les Ecoles à ce jour :");
        List<Ecole> listeEcole = this.controllerAfficherEcoles.getAllEcoles();

        ArrayList<String> listeActions = new ArrayList<String>();
        listeActions.add("Retour à l'accueil");
        listeActions.add("Quitter");

        String output = "";

        for (int i = 0; i < listeActions.size(); ++i)
        {
            output += "	" + (i + 1) + " - " + listeActions.get(i) + "\n";
        }

        int inc = 1;
        for (Ecole e : listeEcole)
        {
            System.out.println(inc + " - " + e);
            ++inc;
        }

        output += "\nVeuillez entrer le numéro correspondant à votre choix (exemple : 1) :";
        System.out.println(output);

        String stringAction = "";
        int intAction = 0;

        while (intAction <= 0 || intAction > listeActions.size())
        {
            stringAction = objetEntree.nextLine();
            try
            {
                intAction = Integer.parseInt(stringAction);
                if (intAction <= 0 || intAction > listeActions.size())
                {
                    System.out.println("Erreur ! Il faut entrer un nombre valide (exemple : 1) !");
                }
            } catch (Exception e)
            {
                System.out.println("Erreur ! Il faut entrer un nombre valide (exemple : 1) !");
            }
        }

        System.out.println("Vous allez être redirigé vers : " + listeActions.get(intAction - 1) + "\n");

        this.controllerAfficherEcoles.Redirection(intAction);
    }

}