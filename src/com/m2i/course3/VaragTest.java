package com.m2i.course3;


public class VaragTest {


    /*
    Permettent de passer un nombre variable d'arguments à une méthode.

Cela évite de devoir surcharger une méthode pour accepter un nombre différent d'arguments.

En utilisant varargs, vous pouvez passer n’importe quel nombre d'arguments (y compris aucun) d'un même type à une méthode.

Se déclarent en utilisant trois points (...) après le type d'argument dans la signature de la méthode
     */
    public static void main(String[] args) {
     //   afficherNombres(1, 2, 3, 4, 5); // Passage de 5 arguments
        afficherNombres(10, 20);        // Passage de 2 arguments
     //   afficherNombres();              // Aucun argument passé
    }

    // Méthode utilisant varargs
    public static void afficherNombres(int... nombres) {
        for (int nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
