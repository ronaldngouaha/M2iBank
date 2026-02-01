package com.m2i.course5;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;



/*
*
Explications :
readLock() : plusieurs lecteurs peuvent accéder concurremment à data.
writeLock() : un seul écrivain à la fois, bloque tous les autres lecteurs et écrivains.
Améliore la performance quand les lectures sont nombreuses et les écritures rares.
Optimise l’accès concurrent grâce à la séparation lecture/écriture.
* */
public class DonneesPartagees {
    private String data = "initial";
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();

    // Lecture : plusieurs threads peuvent lire simultanément
    public String lire() {
        rwLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()
                    + " lit : " + data);
            return data;
        } finally {
            rwLock.readLock().unlock();
        }
    }

    // Écriture : accès exclusif
    public void ecrire(String nouvelleValeur) {
        rwLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()
                    + " écrit : " + nouvelleValeur);
            data = nouvelleValeur;
        } finally {
            rwLock.writeLock().unlock();
        }
    }
}
