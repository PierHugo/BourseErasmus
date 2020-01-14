package com.controller;

import com.view.VueAccueil;

public class ControllerAccueil {

    private ControllerMain controllerMain;

    private VueAccueil vueAccueil;

    public ControllerAccueil(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
        vueAccueil = new VueAccueil(this);
    }

    public void Affichage() {
        vueAccueil.Affichage();
    }


    public void RenvoyerVers(int intAction) {
        switch(intAction) {
            case 1:
                controllerMain.lancerAjouterCandidature();
                return;
            case 2:
                controllerMain.lancerAfficherCandidatures();
                return;
            case 3:
                controllerMain.lancerAfficherEcoles();
                return;
            case 4:
                controllerMain.fermerApplication();

        }
    }
}
