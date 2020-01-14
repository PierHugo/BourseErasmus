package com.controller;

import com.view.VueAfficherCandidature;

public class ControllerAfficherCandidatures {

    private ControllerMain controllerMain;

    private VueAfficherCandidature vueAfficherCandidature;

    public ControllerAfficherCandidatures(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
        vueAfficherCandidature = new VueAfficherCandidature(this);
    }
}
