package com.DB;

import com.model.*;

import javax.persistence.EntityManager;

public abstract class JeuDeDonnees
{

    public static EntityManager em;

    public static void createDatas(EntityManager emparam) throws Exception
    {

        em = emparam;

        // Creation Professeurs
        em.getTransaction().begin();
        Professeur gilou = new Professeur("VENTURINI", "Gilles");
        Professeur polonais = new Professeur("VODKA", "Vladimir");
        em.persist(gilou);
        em.persist(polonais);
        em.getTransaction().commit();

        //Creation Ecoles
        em.getTransaction().begin();
        Ecole polytech = new Ecole("Polytech Tours", 100, gilou);
        Ecole lodz = new Ecole("Polytecknica Lodza", 100, polonais);
        em.persist(polytech);
        em.persist(lodz);
        em.getTransaction().commit();

        // Creation Etudiants
        em.getTransaction().begin();
        Etudiant erwann = new Etudiant("PIEDLOUP", "Erwann", 15);
        Etudiant ph = new Etudiant("CARPENTIER", "Pier-Hugo", 12);
        em.persist(erwann);
        em.persist(ph);
        em.getTransaction().commit();

        // Creation Enseignements
        em.getTransaction().begin();
        Enseignement ens1 = new Enseignement("RESEAU", 5, 55, polytech);
        Enseignement ens2 = new Enseignement("INTELLIGENCE ARTIFICIELLE", 15, 2, polytech);
        Enseignement ens3 = new Enseignement("ARCHITECTURE SYSTEME ET RESEAUX", 20, 3, polytech);
        Enseignement ens4 = new Enseignement("BASE DE DONNEES", 2, 100, lodz);
        Enseignement ens5 = new Enseignement("ANGLAIS", 1, 500, lodz);
        Enseignement ens6 = new Enseignement("PORTUGAIS", 100, 4000, lodz);
        em.persist(ens1);
        em.persist(ens2);
        em.persist(ens3);
        em.persist(ens4);
        em.persist(ens5);
        em.persist(ens6);
        em.getTransaction().commit();

        // Creation Candidatures
        try
        {
            em.getTransaction().begin();
            Candidature ph1 = new Candidature(ph, lodz, 12, 13);
            Candidature erwann1 = new Candidature(erwann, lodz, 14, 16);
            em.persist(ph1);
            em.persist(erwann1);
            em.getTransaction().commit();
        } catch (Exception e)
        {
            throw e;
        }

    }
}
