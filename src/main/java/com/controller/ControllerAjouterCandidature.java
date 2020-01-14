package com.controller;

import com.view.VueAjouterCandidature;

public class ControllerAjouterCandidature {

    private ControllerMain controllerMain;

    private VueAjouterCandidature vueAjouterCandidature;

    public ControllerAjouterCandidature(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
        vueAjouterCandidature = new VueAjouterCandidature(this);
    }
}
