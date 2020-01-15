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
    private double noteOrigine;
    @Column(name = "notedestination")
    private double noteDestination;
    @Column(name = "score")
    private double score;

    public Candidature()
    {
    }

    public Candidature(Etudiant etudiant, Ecole ecoleDestination, double noteOrigine, double noteDestination)
    {
        this.etudiant = etudiant;
        this.ecoleDestination = ecoleDestination;
        this.noteOrigine = noteOrigine;
        this.noteDestination = noteDestination;
    }

    public int getIdCandidature()
    {
        return idCandidature;
    }

    public void setIdCandidature(int idCandidature)
    {
        this.idCandidature = idCandidature;
    }

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

    public double getNoteOrigine()
    {
        return noteOrigine;
    }

    public void setNoteOrigine(int noteOrigine)
    {
        this.noteOrigine = noteOrigine;
    }

    public double getNoteDestination()
    {
        return noteDestination;
    }

    public void setNoteDestination(int noteDestination)
    {
        this.noteDestination = noteDestination;
    }

    public double getScore()
    {
        return score;
    }

    public void calculerScore(double score)
    {
        score = (noteDestination + noteOrigine + etudiant.getMoyenne()) / 3;
    }

    @Override
    public String toString()
    {
        String noteOrigine = "", noteDestination = "";
        noteOrigine = String.valueOf(this.getNoteOrigine());
        noteDestination = String.valueOf(this.getNoteDestination());
        return this.getEtudiant().toString() + " ( moyenne : " + this.getEtudiant().getMoyenne() + ", note responsable Local : " + noteOrigine + ", note responsable Ecole : " + noteDestination + ", score : " + this.getScore(calculerScore()) + " )";
    }
}
