package com.m2i.course4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExempleTryWithResources {
    public static void main(String[] args) {
        String cheminFichier = "example.txt";
        try (BufferedReader lecteur = new BufferedReader(new FileReader(cheminFichier))) {

            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
