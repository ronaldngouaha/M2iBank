package com.m2i.course4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APIProcess {

    public static void main(String[] args){

        /*
        La classe ProcessBuilder permet de définir une commande, ses arguments, son répertoire de travail, ses variables d’environnement, etc.
        * */

        ProcessBuilder pb = new ProcessBuilder("ping", "google.com");
        try {
            Process process = pb.start();
            System.out.println(process.info());

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.contains("timeout")|| line.contains("attente")){
                    System.out.println("Impossible de joindre l'hote");

                    //process.destroy();
                }
                System.out.println(line);
            }



            /*
            Toujours lire getInputStream() et getErrorStream() pour éviter que les tampons de sortie (stdout) ou d’erreur (stderr)
             se remplissent et que le processus se bloque.
            * */
            BufferedReader output = new BufferedReader(
                    new InputStreamReader(process.getInputStream())
            );

            System.out.println("output printed counted :"+ output.lines().count());
            while ((line = output.readLine()) != null) {
                System.out.println(line);
            }


            BufferedReader errors = new BufferedReader(
                    new InputStreamReader(process.getErrorStream())
            );

            System.out.println("Error printed counted :"+ errors.lines().count());
            while ((line = errors.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

/*
Rediriger les flux avec redirectOutput() et redirectError().
Cela évite au développeur d’avoir à gérer les InputStream et BufferedReader lui-même.
 S’il ne veut pas lire manuellement les flux, il peut les rediriger vers un fichier ou vers la console Java.


ProcessHandle - Utitlité

 Surveillance système : voir quels processus tournent

Debugging : identifier les processus zombies ou bloqués

Automatisation : réagir à la fin d’un processus (ex. : nettoyage, notification)

* */

        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        ProcessHandle current = ProcessHandle.current();
        System.out.println("PID actuel : " + current.pid());


        ProcessHandle.allProcesses()
                .filter(ProcessHandle::isAlive )
                //.filter(processHandle -> !processHandle.info().command().toString().contains("java"))
                .forEach(ph -> {

                  //  System.out.println("PID : " + ph.pid()+"; Info : "+ph.info());
                    ProcessHandle.Info info = current.info();
                    info.command().ifPresent(cmd -> System.out.println("Commande : " + cmd));
                    info.user().ifPresent(user -> System.out.println("Utilisateur : " + user));

                    //Permet de réagir à la fin d’un processus de manière asynchrone :


                    ph.onExit().thenRun(() -> System.out.println("Processus terminé."));


                    System.out.println("************************************************************");


                        }
                );


    }
}
