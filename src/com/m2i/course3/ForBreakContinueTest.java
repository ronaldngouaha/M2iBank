package com.m2i.course3;


public class ForBreakContinueTest {

    /*
    break : Arrête la boucle immédiatement.

    continue : Passe à l'itération suivante
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Arrête la boucle
            }
            if (i % 2 == 0) {
                continue; // Ignore cette itération
            }
            System.out.println(i);
        }
    }
}

