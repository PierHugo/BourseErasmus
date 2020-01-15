package com.controller;

import com.model.Candidature;
import com.view.VueAfficherCandidature;

import java.util.List;

public class ControllerAfficherCandidatures
{

    private ControllerMain controllerMain;

    private VueAfficherCandidature vueAfficherCandidature;

    public ControllerAfficherCandidatures(ControllerMain controllerMain)
    {
        this.controllerMain = controllerMain;
        vueAfficherCandidature = new VueAfficherCandidature(this);
    }

    public List<Candidature> getAllCandidatures()
    {
        return this.controllerMain.getAllCandidatures();
    }

    public void Affichage()
    {
        vueAfficherCandidature.Affichage();
    }

    public void Redirection(int intAction)
    {
        switch (intAction)
        {
            case 1:
                this.controllerMain.lancerAccueil();
                return;
            case 2:
                return;
        }
    }

    public ControllerMain getControllerMain()
    {
        return controllerMain;
    }
}
