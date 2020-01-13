package com.model;

import javax.persistence.*;

@Entity
public class Professeur
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProfesseur;
    @OneToOne
    private Ecole ecole;

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
