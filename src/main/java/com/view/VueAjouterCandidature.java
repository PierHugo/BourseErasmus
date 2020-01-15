package com.view;

import com.controller.ControllerAjouterCandidature;
import com.model.Ecole;
import com.model.Etudiant;

import java.util.Scanner;

public class VueAjouterCandidature
{

    private ControllerAjouterCandidature controllerAjouterCandidature;

    public VueAjouterCandidature(ControllerAjouterCandidature controllerAjouterCandidature)
    {
        this.controllerAjouterCandidature = controllerAjouterCandidature;
    }

    public void Affichage()
    {

/*
        try
        {
            Runtime.getRuntime().exec("cmd /c cls");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
*/

        Scanner objetEntree = new Scanner(System.in);

        System.out.println("Créer une Candidature\n");


        int ajoute = 0;

        Ecole ecoleDestination;
        double noteOrigine;
        double noteDestination;
        double score;

        while (ajoute == 0)
        {

            Etudiant etudiant = null;
            long longNumeroEtudiant = -1;

            while (etudiant == null)
            {
                System.out.println("Entrez le numero étudiant de l'étudiant concerné : ");
                String stringNumeroEtudiant = objetEntree.nextLine();
                longNumeroEtudiant = Long.parseLong(stringNumeroEtudiant);

                etudiant = this.controllerAjouterCandidature.getEtudiant(longNumeroEtudiant);
                if (etudiant == null)
                {
                    System.out.println("Erreur lors de la récupération de l'étudiant, veuillez essayer à nouveau.");
                }

            }

            Ecole ecole = null;
            String nomEcole;

            while (ecole == null)
            {

                System.out.println("Entrez le nom de l'école de destination : ");
                nomEcole = objetEntree.nextLine();

                ecole = this.controllerAjouterCandidature.getEcole(nomEcole);
                if (ecole == null)
                {
                    System.out.println("Erreur lors de la récupération de l'école, veuillez essayer à nouveau.");
                }

            }

            System.out.println("Entrez la note d'origine de la candidature : ");
            String stringNoteOrigine = objetEntree.nextLine();
            double doubleNoteOrigine = -1;
            try
            {
                doubleNoteOrigine = Double.parseDouble(stringNoteOrigine);
                if (doubleNoteOrigine < 0 || doubleNoteOrigine > 20)
                {
                    System.out.println("Veuillez une note valide ( entre 0 et 20 )");
                }
            } catch (Exception e)
            {
                System.out.println("Veuillez une note valide ( exemple 12 )");
            }

            System.out.println("Entrez la note de destination de la candidature : ");
            String stringNoteDestination = objetEntree.nextLine();
            double doubleNoteDestination = -1;
            try
            {
                doubleNoteDestination = Double.parseDouble(stringNoteDestination);
                if (doubleNoteDestination < 0 || doubleNoteDestination > 20)
                {
                    System.out.println("Veuillez une note valide ( entre 0 et 20 )");
                }
            } catch (Exception e)
            {
                System.out.println("Veuillez une note valide ( exemple 12 )");
            }

            if (etudiant != null || ecole != null || doubleNoteDestination != -1 || doubleNoteOrigine != -1)
            {
                System.out.println("Ajout de la candidature...");
                this.controllerAjouterCandidature.creerCandidature(etudiant, ecole, doubleNoteOrigine, doubleNoteDestination);
                ajoute = 1;
            } else
            {
                System.out.println("Erreur lors de l'ajout de la candidature ! Veuillez réessayer.\n\n");
            }

        }

        this.controllerAjouterCandidature.Redirection();

    }
}
