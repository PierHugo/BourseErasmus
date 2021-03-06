package com.controllerDAO;

import com.model.Etudiant;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DAOEtudiant
{
    private static EntityManager em;
    private static String nomBase = "Etudiant";

    public DAOEtudiant(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Etudiant> getAllEtudiants()
    {
        return em.createQuery("SELECT e FROM " + nomBase + " e").getResultList();
    }

    public static Etudiant getEtudiantFromNumeroEtudiant(long parameter)
    {
        Query query = em.createQuery("SELECT e FROM " + nomBase + " e where numeroEtudiant = :numeroEtudiant");
        query.setParameter("numeroEtudiant", parameter);

        List<Etudiant> results = query.getResultList();

        if (results.size() > 0)
            return results.get(0);
        else
            return null;
    }

}
