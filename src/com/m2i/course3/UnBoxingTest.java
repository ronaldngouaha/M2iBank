package com.m2i.course3;


public class UnBoxingTest {
    public static void main(String[] args) {
        Integer wrapperNombre = 20; // Autoboxing

        // Unboxing : Conversion automatique en int
        int nombre = wrapperNombre;

        System.out.println("Valeur de nombre : " + nombre);
    }

}
