package com.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etudiant extends Personne
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroEtudiant;
    @Column(name = "moyenne")
    private int moyenne;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private List<Candidature> candidatures;

    public int getNumeroEtudiant()
    {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant)
    {
        this.numeroEtudiant = numeroEtudiant;
    }

    public int getMoyenne()
    {
        return moyenne;
    }

    public void setMoyenne(int moyenne)
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
