package com.m2i.course5;

import java.util.concurrent.Semaphore;



public class ExempleSemaphore {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2); // 2 permis seulement
        Runnable travail = () -> {
            String nom = Thread.currentThread().getName();
            try {
                sem.acquire();
                System.out.println(nom + " : accès autorisé");
                Thread.sleep(500); // simule travail
                System.out.println(nom + " : libération");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                sem.release();
            }
        };
        for (int i = 1; i <= 10; i++) {
            new Thread(travail, "Worker-" + i).start();
        }
    }
}
