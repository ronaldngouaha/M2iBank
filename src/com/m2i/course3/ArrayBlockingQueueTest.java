package com.m2i.course3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Predicate;

public class ArrayBlockingQueueTest {
    public static void main(String[] args) {
        // File de taille 3
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
        // Thread producteur
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 50; i++) {
                    queue.put(i); // Bloque si plein
                    System.out.println("Produit : " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        // Thread consommateur
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    Integer item = queue.take(); // Bloque si vide
                    System.out.println("Consommé : " + item);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        producer.start();
        consumer.start();

        

        Predicate<String> estLong = s -> s.length() > 5;
        System.out.println(estLong.test("Bonjour")); // true
        System.out.println(estLong.test("Salut"));   // false


    }
}
