package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Enseignement
{
    @Id
    @Column(name = "nom")
    private String nom;
    @Column(name = "credits")
    private int credits;
    @Column(name = "heures")
    private int heures;
    @ManyToOne
    private Ecole ecole;

    public Enseignement()
    {
    }

    public Enseignement(String nom, int credits, int heures, Ecole ecole)
    {
        this.nom = nom;
        this.credits = credits;
        this.heures = heures;
        this.ecole = ecole;
    }


    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getCredits()
    {
        return credits;
    }

    public void setCredits(int credits)
    {
        this.credits = credits;
    }

    public int getHeures()
    {
        return heures;
    }

    public void setHeures(int heures)
    {
        this.heures = heures;
    }

    public Ecole getEcole()
    {
        return ecole;
    }

    public void setEcole(Ecole ecole)
    {
        this.ecole = ecole;
    }
}
