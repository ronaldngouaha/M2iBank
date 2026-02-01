package com.m2i.course5;

import java.util.concurrent.atomic.AtomicInteger;

public class ExempleAtomicInteger {
    // Remplace int counter = 0;
    private final AtomicInteger atomicCounter = new AtomicInteger(0);

    private int plainCounter = 0;


    public void incrementerAtomic() {
// incrémente et retourne la nouvelle valeur
        int nouvelleValeur = atomicCounter.incrementAndGet();
        System.out.println(Thread.currentThread().getName()
                + " -> atomicCounter = " + nouvelleValeur);
    }

    public void incrementerPlain() {
// NON atomique : race condition possible
        plainCounter++;
        System.out.println(Thread.currentThread().getName()
                + " -> plainCounter = " + plainCounter);
    }
}
