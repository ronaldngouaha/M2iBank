package com.m2i.course4;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }  finally {
            System.out.println("Ce bloc est toujours exécuté.");
        }


        Compte compte =new Compte();

        compte.solde=200;
        try {
            compte.retirer(300);
        } catch (CustomizeException.SoldeInsuffisantException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Ce bloc est toujours exécuté.");
        }

        Compte.Person person=new Compte.Person();
        person.definirAge(-20);
    }
}

