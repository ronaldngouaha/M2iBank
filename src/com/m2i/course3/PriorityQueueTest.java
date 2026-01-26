package com.m2i.course3;

import java.util.PriorityQueue;
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(30);
        queue.offer(10);
        queue.offer(20);
        System.out.println(queue.poll()); // Affiche "10" (élément avec la plus petite valeur)



    }
}
