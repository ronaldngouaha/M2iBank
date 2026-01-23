package com.m2i.course1;

import java.util.Vector;

public class VectorTypes {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Ajout d'éléments
        vector.add("Alice");
        vector.add("Bob");
        vector.add("Charlie");

        // Accès rapide par index
        System.out.println("Élément à l'index 1 : " + vector.get(1));

        // Suppression d'un élément
        vector.remove("Bob");

        vector.add(1,"jACK");
        vector.add(0,"jACK 9");
        // Affichage des éléments
        System.out.println("Vector après suppression : " + vector);
    }
}

