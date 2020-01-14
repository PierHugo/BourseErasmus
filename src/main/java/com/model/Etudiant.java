package com.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Etudiant extends Personne
{
    @Id
    @Column (name = "numeroEtudiant")
    private long numeroEtudiant;
    @Column(name = "moyenne")
    private double moyenne;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private List<Candidature> candidatures;

    public Etudiant()
    {
        super();
    }

    public Etudiant(String nom, String prenom, long numeroEtudiant)
    {
        super(nom, prenom);
        this.numeroEtudiant = numeroEtudiant;
        candidatures = new ArrayList<>(2)
        {
        };
    }

    public Etudiant(String nom, String prenom, long numeroEtudiant ,double moyenne)
    {
        super(nom, prenom);
        this.numeroEtudiant = numeroEtudiant;
        this.moyenne = moyenne;
        candidatures = new ArrayList<>(2)
        {
        };
    }

    public long getNumeroEtudiant()
    {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(long numeroEtudiant)
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

    public void ajouterCandidature(Candidature candidature) throws Exception {
        if (candidatures.size() < 2) {
            candidatures.add(candidature);
        } else {
            throw new Exception();
        }
    }

        public void supprimerCandidature(Candidature candidature) {
            if(candidatures.contains(candidature))
                candidatures.remove(candidature);
        }
    }

