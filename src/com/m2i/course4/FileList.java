package com.m2i.course4;


//Accès au système de fichier avec NIO2 - Lire toutes les lignes d'un fichier

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileList {
    public static void main(String[] args) {
        //  Créer un chemin (Path)
        Path chemin = Paths.get("public/media/rapport.txt");

        // Lire toutes les lignes d’un fichier

        try {
            List<String> lignes = Files.readAllLines(chemin);
           // lignes.forEach(System.out::println);
            lignes.stream()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
