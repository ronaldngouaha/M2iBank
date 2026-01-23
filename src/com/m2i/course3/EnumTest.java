package com.m2i.course3;

public class EnumTest {
    public static void main(String[] args) {
        Jour jourActuel = Jour.MERCREDI; // Déclaration d'une variable de type enum

        System.out.println("Aujourd'hui, nous sommes : " + jourActuel);

        // Comparaison d'un enum
        if (jourActuel == Jour.MERCREDI) {
            System.out.println("C'est le milieu de la semaine !");
        }
    }

    public enum Jour {
        LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE
    }
}
