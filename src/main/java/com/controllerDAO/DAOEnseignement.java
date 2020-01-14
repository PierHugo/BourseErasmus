package com.controllerDAO;

import com.model.Enseignement;

import javax.persistence.EntityManager;
import java.util.List;

public class DAOEnseignement
{
    private static EntityManager em;
    private static String nomBase = "enseignement";

    public DAOEnseignement(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Enseignement> getAllEnseignements()
    {
        List<Enseignement> results = em.createQuery("SELECT e FROM " + nomBase + " e").getResultList();

        return results;
    }
}
