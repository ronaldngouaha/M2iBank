package com.m2i.course4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


//Accès au système de fichier avec NIO2 - Ecrire dans un fichier

public class FileWriter {
    public static void main(String[] args) {

        Path chemin = Paths.get("public/media/rapport.txt");


        try {
            List<String> lignes = Files.readAllLines(chemin);
            lignes.add("\n Helloword, New line added");
            Files.write(Paths.get("public/media/rapport.txt"), lignes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
