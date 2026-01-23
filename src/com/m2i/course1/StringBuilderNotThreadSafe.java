package com.m2i.course1;

public class StringBuilderNotThreadSafe {
    public static void main(String[] args) {
        SharedStringBuilder resource = new SharedStringBuilder();
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
class SharedStringBuilder {
    StringBuilder builder = new StringBuilder("Début ");
    public void ajouterTexte(String texte) {
        builder.append(texte);
        System.out.println(Thread.currentThread().getName() + " : " + builder);
    }
}
