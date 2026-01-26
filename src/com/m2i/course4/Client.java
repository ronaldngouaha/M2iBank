package com.m2i.course4;

import java.util.Optional;

public class Client {

    private String nom;

    public Optional<String> getNom(Client client) {


        return Optional.ofNullable(client.getNom());
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
