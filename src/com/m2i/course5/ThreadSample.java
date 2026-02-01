package com.m2i.course5;

public class ThreadSample {

    public static void main(String[] args) {

        // Tache 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tache 1 - étape " + i);
        }

        // Tache 2
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tache 2 - étape " + i);
        }


        // Tâche 1
        Runnable tache1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Tache 1 - étape " + i);
            }
        };



// Tâche 2
        Runnable tache2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Tache 2 - étape " + i);
            }
        };



// Création des threads
        Thread thread1 = new Thread(tache1, "Thread-Tache1");
        Thread thread2 = new Thread(tache2, "Thread-Tache2");



// Lancement des threads
        thread1.start();
        thread2.start();
    }
}

