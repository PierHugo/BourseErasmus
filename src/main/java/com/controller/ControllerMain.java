package com.controller;

import com.controllerDAO.DAOCandidature;
import com.controllerDAO.DAOEcole;
import com.controllerDAO.DAOEnseignement;
import com.controllerDAO.DAOEtudiant;
import com.view.VueAccueil;

import javax.persistence.EntityManager;

public class ControllerMain
{
    public static EntityManager em;
    //TODO : pq this ?
    private  DAOEcole daoEcole;

    private  DAOEtudiant daoEtudiant;

    private  DAOEnseignement daoEnseignement;

    private  DAOCandidature daoCandidature;

    private ControllerAccueil controllerAccueil;

    private ControllerAfficherCandidatures controllerAfficherCandidatures;

    private ControllerAfficherEcoles controllerAfficherEcoles;

    private ControllerAjouterCandidature controllerAjouterCandidature;

    public ControllerMain(EntityManager em) {
        this.em = em;
        daoCandidature = new DAOCandidature(this.em);
        daoEnseignement = new DAOEnseignement(this.em);
        daoEtudiant = new DAOEtudiant(this.em);
        daoEcole = new DAOEcole(this.em);

        controllerAccueil = new ControllerAccueil(this);
        controllerAfficherCandidatures = new ControllerAfficherCandidatures(this);
        controllerAfficherEcoles = new ControllerAfficherEcoles(this);
        controllerAjouterCandidature = new ControllerAjouterCandidature(this);

    }


    public void lancerAjouterCandidature() {
    }

    public void lancerAfficherCandidatures() {
    }

    public void lancerAfficherEcoles() {
    }

    public void lancerAccueil() {
        controllerAccueil.Affichage();
    }

    public void fermerApplication() {
    }


}
