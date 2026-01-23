package com.m2i.course1;

import java.util.LinkedHashSet;

public class LinkedHashSetTypes {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");
        set.add("Alice"); // Ignoré car déjà présent

        System.out.println("LinkedHashSet (ordre conservé) : " + set);
    }
}
