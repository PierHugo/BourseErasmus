package com.controllerDAO;

import com.model.Ecole;

import javax.persistence.EntityManager;
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
}
