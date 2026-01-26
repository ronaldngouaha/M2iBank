package com.m2i.course3;

import java.util.ArrayDeque;
public class ArrayDequeTest {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.offerFirst("A");
        queue.offerLast("B");
        queue.offerLast("B2");
        queue.offerFirst("C");
        System.out.println(queue); // Affiche "C" et le supprime dans la liste
        System.out.println(queue.poll()); // Affiche "C" et le supprime dans la liste
        System.out.println(queue.poll()); // Affiche "A" et le supprime dans la liste
        System.out.println(queue);
    }
}
