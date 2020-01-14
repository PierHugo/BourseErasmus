package com.main;

import com.DB.JeuDeDonnees;
import com.controller.ControllerMain;

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
//        try
//        {
//            JeuDeDonnees.createDatas(em);
//        } catch (Exception e)
//        {
//            System.out.println("Erreur lors de la création de la base de données ou des données :\n-> " + e);
//        }

        /* Application */
        try
        {
            ControllerMain main = new ControllerMain(em);

            main.lancerAccueil();
            main.fermerApplication();
        }
        catch (Exception e)
        {
            System.out.println("Erreur lors de l'utilisation de l'application :\n-> " + e);
        }

    }
}
