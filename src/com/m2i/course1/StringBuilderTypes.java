package com.m2i.course1;

public final class StringBuilderTypes {
    public static void main(String[] args) {
        // Concatenation avec String

        String texte = "";

        long startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            texte += "Java"; // Création d'un nouvel objet à chaque itération
        }
        long endTime = System.nanoTime();
        System.out.println("Temps avec String : " + (endTime - startTime) / 1e6 + " ms");
        System.out.println("StringBuilder: "+ texte);
        // Concatenation avec StringBuilder

        StringBuilder texteBuilder = new StringBuilder();

        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            texteBuilder.append("Java"); // Modifie le même objet en mémoire
        }
        long endTimeBuilder = System.nanoTime();
        System.out.println("Temps avec StringBuilder : " + (endTimeBuilder - startTimeBuilder) / 1e6 + " ms");
        System.out.println("StringBuilder: "+ texteBuilder);


        StringBuffer textBuffer= new StringBuffer();

        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            textBuffer.append("Java"); // Modifie le même objet en mémoire
        }

        long endTimeBuffer = System.nanoTime();
        System.out.println("Temps avec StringBuffer : " + (endTimeBuffer - startTimeBuffer) / 1e6 + " ms");
        System.out.println("StringBuffer: "+ texteBuilder);


    }
}
