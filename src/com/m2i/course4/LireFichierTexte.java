package com.m2i.course4;

import java.io.*;

public class LireFichierTexte {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("public/media/rapport.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
