package com.m2i.course4;

import java.util.Optional;

public class APIOptional {

    public static void main(String[] args){
Client client= new Client();

client.setNom("Alice");
        Optional<String> nom = Optional.of("Alice");
        Optional<String> vide = Optional.empty();

        Optional<String> nomd = Optional.ofNullable(client.getNom());

        if (nomd.isPresent()) {
            System.out.println("Nom : " + nomd.get());
        } else {
            System.out.println("Nom inconnu");
        }

        nom.ifPresent(n -> System.out.println("Nom : " + n));
    }


    public String getNom(Client client) {
        if (client != null) {

            return client.getNom();
        } else {
            return "Inconnu";
        }
    }

}


