package com.controllerDAO;

import com.model.Ecole;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DAOEcole
{
    private static EntityManager em;
    private static String nomBase = "Ecole";

    public DAOEcole(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Ecole> getAllEcoles()
    {
        return em.createQuery("SELECT e FROM " + nomBase + " e").getResultList();
    }

    public static Ecole getEcoleFromNom(String parameter)
    {
        Query query = em.createQuery("SELECT e FROM " + nomBase + " e where nom = :nomEcole");
        query.setParameter("nomEcole", parameter);

        List<Ecole> results = query.getResultList();

        if (results.size() > 0)
            return results.get(0);
        else
            return null;
    }
}
