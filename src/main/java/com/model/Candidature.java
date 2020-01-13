package com.model;

import javax.persistence.*;

@Entity
public class Candidature
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCandidature;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private Ecole ecoleDestination;
    @Column(name = "noteorigine")
    private int noteOrigine;
    @Column(name = "notedestination")
    private int noteDestination;
    @Column(name = "score")
    private int score;

    public Etudiant getEtudiant()
    {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant)
    {
        this.etudiant = etudiant;
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
