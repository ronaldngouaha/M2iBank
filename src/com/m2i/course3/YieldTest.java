package com.m2i.course3;

public class YieldTest {


    /*
    Introduit pour permettre à un switch de retourner une valeur à partir d'un bloc de code

utile lorsque l'on doit exécuter plusieurs instructions avant de produire un résultat

est nécessaire lorsque le case utilise un bloc

Remplace return dans un switch expression
     */
    public static void main(String[] args) {
        String type = "chien";

        String sound = switch (type) {
            case "chat" -> "Miaou";
            case "chien" -> {
                System.out.println("Animal domestique");
                yield "Wouf";  // Utilisation de yield pour retourner une valeur
            }
            default -> "Son inconnu";
        };

        System.out.println(sound);
    }
}

