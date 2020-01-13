package com.model;

public class Candidature
{
    private int numeroEtudiant;
    private Ecole ecoleDestination;
    private int noteOrigine;
    private int noteDestination;
    private int score;

    public int getNumeroEtudiant()
    {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant)
    {
        this.numeroEtudiant = numeroEtudiant;
    }

    public Ecole getEcoleDestination()
    {
        return ecoleDestination;
    }

    public void setEcoleDestination(Ecole ecoleDestination)
    {
        this.ecoleDestination = ecoleDestination;
    }

    public int getNoteOrigine()
    {
        return noteOrigine;
    }

    public void setNoteOrigine(int noteOrigine)
    {
        this.noteOrigine = noteOrigine;
    }

    public int getNoteDestination()
    {
        return noteDestination;
    }

    public void setNoteDestination(int noteDestination)
    {
        this.noteDestination = noteDestination;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }
}
