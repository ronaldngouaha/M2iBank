package com.m2i.course1;

public class StringBufferThreadSafe {
    public static void main(String[] args) {
        SharedStringBuffer resource = new SharedStringBuffer();
        Thread t0 = new Thread(() -> resource.ajouterTexte("Thread0 "));
        Thread t1 = new Thread(() -> resource.ajouterTexte("Thread1 "));
        Thread t2 = new Thread(() -> resource.ajouterTexte("Thread2 "));
        Thread t3 = new Thread(() -> resource.ajouterTexte("Thread3 "));
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
class SharedStringBuffer {
    StringBuffer buffer = new StringBuffer("Début ");
    public void ajouterTexte(String texte) {
        synchronized (this) { // Empêche les threads d'accéder en même temps
            buffer.append(texte);
            System.out.println(Thread.currentThread().getName() + " : " + buffer);
        }
    }
}

