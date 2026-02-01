package com.m2i.course5;

import java.util.concurrent.locks.ReentrantLock;

class CompteurVerrou {
    private int valeur = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public  void incrementer() {
        System.out.println(Thread.currentThread().getName()+" procède à l'incrementation");

        lock.lock(); // acquisition du verrou

        try {
            valeur++; // Synchronisée
        } finally {
            lock.unlock(); // toujours libérer dans finally
        }
    }

    public int getValeur() {
        return valeur;
    }
}

