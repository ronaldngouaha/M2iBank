package com.m2i.course4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EcrireFichierTexte {
    public static void main(String[] args) {
        // L'option true permet ajouter du text au contenue existant
        // Si le fichier n'existe pas, il est cree et le programme ajoute du text au nouveau fichier cree
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("public/media/rapport2.txt", true))) {
            writer.write("Ligne ajoutée !");
            writer.newLine();// Inserts a platform-dependent line separator (preferred over hardcoding \n).
            writer.flush(); //Forces any buffered output to be written immediately to the underlying writer/file.
            writer.close(); //Closes the stream, flushing the buffer first, and releases any system resources associated with the stream.

            System.out.println("Successfully wrote to the file");

        } catch (IOException e) {
            System.err.println("Error writing to the file. "+e.getMessage());
            e.printStackTrace();
        }
    }
}
