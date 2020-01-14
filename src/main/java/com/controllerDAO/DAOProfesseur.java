package com.controllerDAO;

import com.model.Professeur;

import javax.persistence.EntityManager;
import java.util.List;

public class DAOProfesseur
{
    private static EntityManager em;
    private static String nomBase = "professeur";

    public DAOProfesseur(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Professeur> getAllProfesseurs()
    {
        String queryString = "SELECT p FROM " + nomBase + " p";

        List<Professeur> results = em.createQuery(queryString).getResultList();

        return results;
    }

}
