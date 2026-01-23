package com.m2i.course1;

import java.util.TreeSet;

public class TreeSetTypes {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Charlie");
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");

        System.out.println("TreeSet (trié) : " + set);

        // Récupérer le plus petit et le plus grand élément
        System.out.println("Premier élément : " + set.first());
        System.out.println("Dernier élément : " + set.last());
    }
}
