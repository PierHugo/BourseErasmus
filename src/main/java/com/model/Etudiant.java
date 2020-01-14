package com.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Etudiant extends Personne
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroEtudiant;
    @Column(name = "moyenne")
    private double moyenne;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private List<Candidature> candidatures;

    public Etudiant()
    {
        super();
    }

    public Etudiant(String nom, String prenom)
    {
        super(nom, prenom);
        candidatures = new ArrayList<>(2)
        {
        };
    }

    public Etudiant(String nom, String prenom, double moyenne)
    {
        super(nom, prenom);
        this.moyenne = moyenne;
        candidatures = new ArrayList<>(2)
        {
        };
    }

    public int getNumeroEtudiant()
    {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant)
    {
        this.numeroEtudiant = numeroEtudiant;
    }

    public double getMoyenne()
    {
        return moyenne;
    }

    public void setMoyenne(double moyenne)
    {
        this.moyenne = moyenne;
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
