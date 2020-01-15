package com.controller;

import com.controllerDAO.DAOCandidature;
import com.controllerDAO.DAOEcole;
import com.controllerDAO.DAOEnseignement;
import com.controllerDAO.DAOEtudiant;
import com.model.Candidature;
import com.model.Ecole;
import com.model.Etudiant;

import javax.persistence.EntityManager;
import java.util.List;

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

    public ControllerMain(EntityManager em)
    {
        ControllerMain.em = em;
        daoCandidature = new DAOCandidature(ControllerMain.em);
        daoEnseignement = new DAOEnseignement(ControllerMain.em);
        daoEtudiant = new DAOEtudiant(ControllerMain.em);
        daoEcole = new DAOEcole(ControllerMain.em);

        controllerAccueil = new ControllerAccueil(this);
        controllerAfficherCandidatures = new ControllerAfficherCandidatures(this);
        controllerAfficherEcoles = new ControllerAfficherEcoles(this);
        controllerAjouterCandidature = new ControllerAjouterCandidature(this);

    }

    public void lancerAjouterCandidature()
    {
        controllerAjouterCandidature.Affichage();
    }

    public void lancerAfficherCandidatures() {
        controllerAfficherCandidatures.Affichage();
    }

    public void lancerAfficherEcoles() {
        controllerAfficherEcoles.Affichage();
    }

    public void lancerAccueil()
    {
        controllerAccueil.Affichage();
    }

    public void fermerApplication()
    {
    }

    public List<Candidature> getAllCandidatures()
    {
        return DAOCandidature.getAllCandidatures();
    }

    public List<Ecole> getAllEcole()
    {
        return DAOEcole.getAllEcoles();
    }

    public Etudiant getEtudiant(long numero)
    {
        return DAOEtudiant.getEtudiantFromNumeroEtudiant(numero);
    }

    public Ecole getEcole(String nom)
    {
        return DAOEcole.getEcoleFromNom(nom);
    }

    public void creerCandidature(Etudiant etudiant, Ecole ecole, double noteOrigine, double noteDestination)
    {
        em.getTransaction().begin();
        Candidature candidature = new Candidature(etudiant, ecole, noteOrigine, noteDestination);
        em.persist(candidature);
        em.getTransaction().commit();
    }
}