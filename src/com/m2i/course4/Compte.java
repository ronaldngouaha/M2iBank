package com.m2i.course4;

public class Compte {
    double solde;

    public void retirer(double montant) throws CustomizeException.SoldeInsuffisantException {
        if (montant > solde) {
            throw new CustomizeException.SoldeInsuffisantException("Solde insuffisant pour retirer " + montant + "€");
        }
    }



    static class Person {
        public void definirAge(int age) {
            if (age < 0) {
                throw new CustomizeException.DonneeInvalideException("L'âge ne peut pas être négatif");
            }
        }
    }
}



