package com.m2i.course5;

import java.util.concurrent.*;


public class ExempleFixedPool {
    public static void main(String[] args) {
        int poolSize = 4;
        ExecutorService executor = Executors.newFixedThreadPool(poolSize);


        for (int i = 1; i <= 10; i++) {
            final int id = i;
            executor.submit(() -> {
                System.out.printf("Tâche %d lancée par %s%n",
                        id, Thread.currentThread().getName());
                try {
                    Thread.sleep(500); // simule une opération bloquante
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown(); // plus de nouvelles soumissions
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // annule les tâches restantes
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}

