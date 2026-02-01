package com.m2i.course5;

public class ExempleDeadLock3 {
    public static void main(String[] args) throws InterruptedException {
        DonneesPartagees shared = new DonneesPartagees();

// 3 lecteurs simultanés
        Runnable lecteur = () -> {
            for (int i = 0; i < 4; i++) {
                shared.lire();
                try { Thread.sleep(150); }
                catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        };

// 1 écrivain
        Runnable ecrivain = () -> {
            for (int i = 1; i <= 3; i++) {
                shared.ecrire("valeur-" + i);
                try { Thread.sleep(150); }
                catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        };


        Thread w = new Thread(ecrivain, "Writer");
        Thread r1 = new Thread(lecteur, "Reader-1");
        Thread r2 = new Thread(lecteur, "Reader-2");
        r1.start();
        r2.start();
        w.start();
        r1.join(); r2.join(); w.join();




        // Thread de priorité maximale (accapare tout le CPU)
        Thread highPriorityThread = new Thread(() -> {
            while (true) {
                System.out.println("THREAD HIGH travaille...");
            }
        }, "HIGH");
        Thread lowPriorityThread = new Thread(() -> {
            while (true) {
                System.out.println(">>> THREAD LOW veut travailler !");
                try {
                    Thread.sleep(1000); // Juste pour voir s'il a pu s'exécuter
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "LOW");
// Affectation des priorités
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // 10
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);  // 1
// Lancement des threads
        lowPriorityThread.start();
    }
}
