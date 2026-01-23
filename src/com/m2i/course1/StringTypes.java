package com.m2i.course1;

public final class StringTypes {
    public static void main(String[] args) {
        // Demo Immuabilité
        String s1 = "Hello";  // Création d'un objet String
        String s2 = s1;        // s2 pointe vers le même objet que s1
        // Modification de s1
        s1 = s1 + " World";
        // Vérifions les références
        System.out.println("s1: " + s1); // Affiche "Hello World"
        System.out.println("s2: " + s2); // Affiche "Hello" (pas modifié)
        // Vérification des références mémoire
        System.out.println(s1 == s2); // Affiche false (nouvelle instance créée)
    }
}
