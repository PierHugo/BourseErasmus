package com.controller;

import com.view.VueAfficherEcoles;

public class ControllerAfficherEcoles {

    private ControllerMain controllerMain;

    private VueAfficherEcoles vueAfficherEcoles;

    public ControllerAfficherEcoles(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
        vueAfficherEcoles = new VueAfficherEcoles(this);
    }
}
