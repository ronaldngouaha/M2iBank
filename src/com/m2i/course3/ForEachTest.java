package com.m2i.course3;

public class ForEachTest {

    /*
    Avantages :
Pas besoin de gérer un index.
Plus lisible et sûr (évite les erreurs d'indexation).

     */
    public static void main(String[] args) {
        int[] nombres = {1, 2, 3, 4, 5};
        for (int nombre : nombres) {
            System.out.println("Valeur : " + nombre);
        }
    }
}
