package com.controller;

import com.model.Ecole;
import com.view.VueAfficherEcole;

import java.util.List;

public class ControllerAfficherEcoles
{

    private ControllerMain controllerMain;

    private VueAfficherEcole vueAfficherEcole;

    public ControllerAfficherEcoles(ControllerMain controllerMain)
    {
        this.controllerMain = controllerMain;
        vueAfficherEcole = new VueAfficherEcole(this);
    }

    public List<Ecole> getAllEcoles()
    {
        return this.controllerMain.getAllEcole();
    }

    public void Affichage()
    {
        vueAfficherEcole.Affichage();
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
