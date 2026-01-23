package com.m2i.course1;

import java.util.Stack;

public class StackTypes {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Empiler (push) des éléments
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");

        // Afficher la pile
        System.out.println("Pile : " + stack.lastElement());

        // Dépiler (pop) un élément
        System.out.println("Élément dépilé : " + stack.pop());

        // Voir l'élément au sommet (peek)
        System.out.println("Pile : " + stack.peek());


        // Dépiler (pop) un élément
        System.out.println("Élément dépilé : " + stack.pop());

        // Afficher la pile après le pop
        System.out.println("Pile après pop : " + stack);

        // Vérifier si la pile est vide
        System.out.println("La pile est vide ? " + stack.isEmpty());
    }
}
