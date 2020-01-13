package com.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main
{
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
    private static EntityManager em;

    public static void main(String[] args)
    {
        try
        {
            em = entityManagerFactory.createEntityManager();
        } catch (Throwable ex)
        {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        em.getTransaction().begin();

        em.persist(null);

        em.getTransaction().commit();

    }
}