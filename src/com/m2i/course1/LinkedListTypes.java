package com.m2i.course1;


import java.util.ArrayList;

public final class LinkedListTypes {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Ajout d'éléments
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        // Accès rapide par index
        System.out.println("Élément à l'index 1 : " + list.get(1));

        // Suppression d'un élément
        list.remove("Bob");

        list.add(1,"sdds");

        // Affichage des éléments
        System.out.println("Liste après suppression : " + list);
    }
}
