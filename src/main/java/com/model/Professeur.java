package com.model;

import javax.persistence.*;

@Entity
public class Professeur extends Personne
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProfesseur;
    @OneToOne
    private Ecole ecole;

    public Professeur()
    {
        super();
    }

    public Professeur(String nom, String prenom)
    {
        super(nom, prenom);
    }

    public Professeur(String nom, String prenom, Ecole ecole)
    {
        super(nom, prenom);
        this.ecole = ecole;
    }

    public int getIdProfesseur()
    {
        return idProfesseur;
    }

    public void setIdProfesseur(int idProfesseur)
    {
        this.idProfesseur = idProfesseur;
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
