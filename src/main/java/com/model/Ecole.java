package com.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ecole
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEcole;
    @Column(name = "nom")
    private String nom;
    @Column(name = "nbplaces")
    private int nbPlaces;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ecole")
    private List<Enseignement> enseignements;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ecole")
    private Professeur professeur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ecoleDestination")
    private List<Candidature> candidatures;

    public Ecole()
    {
    }

    public Ecole(String nom, int nbPlaces, Professeur professeur)
    {
        this.nom = nom;
        this.professeur = professeur;
        enseignements = new ArrayList<>();
        candidatures = new ArrayList<>();
    }

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

    public int getNbPlaces()
    {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces)
    {
        this.nbPlaces = nbPlaces;
    }

    public List<Enseignement> getEnseignements()
    {
        return enseignements;
    }

    public void setEnseignements(List<Enseignement> enseignements)
    {
        this.enseignements = enseignements;
    }

    public Professeur getProfesseur()
    {
        return professeur;
    }

    public void setProfesseur(Professeur professeur)
    {
        this.professeur = professeur;
    }

    public List<Candidature> getCandidatures()
    {
        return candidatures;
    }

    public void setCandidatures(List<Candidature> candidatures)
    {
        this.candidatures = candidatures;
    }
}
