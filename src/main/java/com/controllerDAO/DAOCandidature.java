package com.controllerDAO;

import com.model.Candidature;
import com.model.Ecole;
import com.model.Etudiant;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DAOCandidature
{
    private static EntityManager em;
    private static String nomBase = "Candidature";

    public DAOCandidature(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Candidature> getAllCandidatures()
    {
        String queryString = "SELECT c FROM " + nomBase + " c";

        List<Candidature> results = em.createQuery(queryString).getResultList();

        return results;
    }

    public static List<Candidature> getCandidaturesFromIdEcole(Ecole parameter)
    {
        String nomParam = "ecoleDestination_idEcole";

        String queryString = "SELECT c FROM " + nomBase + " c WHERE " + nomParam + " = :" + nomParam;
        Query query = em.createQuery(queryString);
        query.setParameter(nomParam, parameter.getIdEcole());

        List<Candidature> results = query.getResultList();

        return results;
    }

    public static List<Candidature> getCandidaturesFromNumeroEtudiant(Etudiant parameter)
    {

        String nomParam = "etudiant_numeroEtudiant";

        String queryString = "SELECT c FROM " + nomBase + " c WHERE " + nomParam + " = :" + nomParam;
        Query query = em.createQuery(queryString);
        query.setParameter(nomParam, parameter.getNumeroEtudiant());

        List<Candidature> results = query.getResultList();

        return results;
    }
}
