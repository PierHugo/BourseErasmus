package com.controller;

import com.model.Ecole;
import com.model.Etudiant;
import com.view.VueAjouterCandidature;

public class ControllerAjouterCandidature
{

    private ControllerMain controllerMain;

    private VueAjouterCandidature creerCandidature;

    public ControllerAjouterCandidature(ControllerMain controllerMain)
    {
        this.controllerMain = controllerMain;
        this.creerCandidature = new VueAjouterCandidature(this);
    }

    public void Affichage()
    {
        this.creerCandidature.Affichage();
    }

    public void Redirection()
    {
        this.controllerMain.lancerAccueil();
    }

    public void creerCandidature(Etudiant etudiant, Ecole ecole, double noteOrigine, double noteDestination)
    {
        this.controllerMain.creerCandidature(etudiant, ecole, noteOrigine, noteDestination);
    }

    public Etudiant getEtudiant(long numero)
    {
        return this.controllerMain.getEtudiant(numero);
    }

    public Ecole getEcole(String nom)
    {
        return this.controllerMain.getEcole(nom);
    }


}
