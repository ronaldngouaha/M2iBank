package com.m2i.course3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForStreamTest {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);
        nombres.forEach(nombre -> System.out.println("Valeur : " + nombre));

        ArrayList <String> school= new ArrayList<>();

        school.add("Liber");
        school.add("Domi");
        school.add("Saker");
        school.add("Savio");

        school.forEach(nombre ->
                {
                    System.out.println("Valeur : " + nombre);
                    System.out.println("Hello ");
                }

        );
    }
}
