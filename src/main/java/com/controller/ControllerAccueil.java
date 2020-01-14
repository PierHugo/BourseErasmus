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



}
