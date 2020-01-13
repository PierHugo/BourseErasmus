package com.model;

import java.util.List;

public class Etudiant extends Personne
{
    private int numeroEtudiant;
    private int moyenne;
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
