package com.m2i.course5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(8);


// Tâche différée de 1 seconde :
        scheduler.schedule(() -> System.out.println("Exécution différée"),
                1, TimeUnit.SECONDS);



// Tâche périodique toutes les 2 secondes (après un délai initial d'1s) :
        scheduler.scheduleAtFixedRate(
                () -> System.out.println("Exécution périodique"),
                1, 2, TimeUnit.SECONDS);



// Arrêt au bout de 10 secondes :
        scheduler.schedule(() -> scheduler.shutdown(),
                1000, TimeUnit.SECONDS);
    }
}
