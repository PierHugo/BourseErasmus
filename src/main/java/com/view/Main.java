package com.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

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

/*
        em.getTransaction().begin();
        em.persist();
        em.getTransaction().commit();
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        String str = sc.nextLine();
        System.out.println("Vous avez saisi : " + str);
    }
}