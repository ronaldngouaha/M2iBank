package com.m2i.course3;


interface Animal {
    void faireDuBruit();
}
class Oiseau {
    void chanter() {
        System.out.println("Cui cui !");
    }
}


public class AnonymousClasseTest {
    public static void main(String[] args) {
        // Déclaration d'une classe anonyme qui implémente Animal
        Animal chat = new Animal() {
            public void faireDuBruit() {
                System.out.println("Miaou !");
            }
        };

        Animal chien= new Animal() {
            @Override
            public void faireDuBruit() {
                System.out.println("Wou");
            }
        };

        chien.faireDuBruit();

        chat.faireDuBruit(); // Affiche "Miaou !"


        // Création d'une classe anonyme héritant de Oiseau
        Oiseau perroquet = new Oiseau() {
            void chanter() {
                System.out.println("Je parle !");
            }
        };

        Oiseau aigle= new Oiseau(){
            @Override
            void chanter() {
                System.out.println("Hey toi");
            }
        };

        aigle.chanter();
        perroquet.chanter(); // Affiche "Je parle !"
    }
}
