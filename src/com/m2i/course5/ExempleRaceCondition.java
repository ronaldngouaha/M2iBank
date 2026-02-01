package com.m2i.course5;

public class ExempleRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        CompteurVerrou compteur = new CompteurVerrou();

        Runnable tache = () -> {
            for (int i = 0; i < 10; i++) {
                compteur.incrementer();
            }
        };

        Thread t1 = new Thread(() -> {
            synchronized (compteur) {
                for (int i = 0; i < 10; i++) {
                    compteur.incrementer();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (compteur) {
                for (int i = 0; i < 10; i++) {
                    compteur.incrementer();
                }
            }
        });


            t1.start();   t2.start();
            t1.join();

            t2.join();

      //  t1.join(); t2.join();

        System.out.println("Résultat attendu : 20");
        System.out.println("Résultat réel : " + compteur.getValeur());
    }
}

