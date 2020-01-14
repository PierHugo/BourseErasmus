package com.main;

import com.DB.JeuDeDonnees;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp
{

    public static void main(String[] args)
    {

        /*Database*/

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
        EntityManager em = entityManagerFactory.createEntityManager();
        try
        {
            JeuDeDonnees.createDatas(em);
        } catch (Exception e)
        {
            System.out.println("Erreur lors de la cr�ation de la base de donn�es ou des donn�es :\n-> " + e);
        }

//        /* Application */
//        try
//        {
//            ControllerMain main = new ControllerMain(em);
//
//            main.launchAccueil();
//            main.launchQuitter();
//        }
//        catch (Exception e)
//        {
//            System.out.println("Erreur lors de l'utilisation de l'application :\n-> " + e);
//        }

    }
}
