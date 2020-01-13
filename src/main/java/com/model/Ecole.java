package com.model;

import java.util.List;

public class Ecole
{
    private int idEcole;
    private String nom;
    private List<Enseignement> enseignements;
    private int idProfesseur;
    private int nbPlaces;

    public int getIdEcole()
    {
        return idEcole;
    }

    public void setIdEcole(int idEcole)
    {
        this.idEcole = idEcole;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public List<Enseignement> getEnseignements()
    {
        return enseignements;
    }

    public void setEnseignements(List<Enseignement> enseignements)
    {
        this.enseignements = enseignements;
    }

    public int getIdProfesseur()
    {
        return idProfesseur;
    }

    public void setIdProfesseur(int idProfesseur)
    {
        this.idProfesseur = idProfesseur;
    }

    public int getNbPlaces()
    {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces)
    {
        this.nbPlaces = nbPlaces;
    }
}
