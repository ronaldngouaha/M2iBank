package com.m2i.course3;

/*
Classe interne (ou nested class)

Classe définie à l'intérieur d'une autre classe.
Permet d'organiser le code de manière logique et d'améliorer l'encapsulation.
Les classes internes standards (inner classes)
Les classes statiques imbriquées (static nested classes)
Les classes locales (local classes)

Classe définie dans une autre classe et qui dépend d'une instance de la classe englobante.
La classe Interne peut accéder aux membres (même private) de la classe englobante.
Pour instancier une classe Interne, on doit créer une instance de la classe englobante en premier.

 */

    class Externe {
        private String message = "Bonjour depuis la classe interne !";

        // Déclaration de la classe interne
        class Interne {
            void afficherMessage() {
                System.out.println(message);
            }
        }
    }

    public class InnerClasseTest {
        public static void main(String[] args) {
            Externe externe = new Externe();

            Externe.Interne interne = externe.new Interne(); // Création de l'objet interne
            interne.afficherMessage();
        }
    }



