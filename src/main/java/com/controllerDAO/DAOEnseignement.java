package com.controllerDAO;

import com.model.Enseignement;
import com.model.Etudiant;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DAOEnseignement
{
    private static EntityManager em;
    private static String nomBase = "Enseignement";

    public DAOEnseignement(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Enseignement> getAllEnseignements()
    {
        List<Enseignement> results = em.createQuery("SELECT e FROM " + nomBase + " e").getResultList();

        return results;
    }

    public static List<Etudiant> getEnsignementsFromIdEcole(long parameter)
    {
        Query query = em.createQuery("SELECT e FROM " + nomBase + " e where idEcole = :numeroEtudiant");
        query.setParameter("idEcole", parameter);

        List<Etudiant> results = query.getResultList();

        return results;
    }
}
