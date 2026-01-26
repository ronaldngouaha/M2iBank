package com.m2i.course3;


import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class LambdaTest {

    /*
    Utilisation de l'API Stream pour traiter la Collection


    Réduction de la verbosité du code

Meilleure lisibilité

Facilite la programmation fonctionnelle

Intégration fluide avec les API modernes comme les Streams


     */


    private static int multiplicateur = 2;

    public static void calculer() {
        int base = 10; // variable locale (effectivement finale)

        Runnable r = () -> {
            System.out.println("Résultat local : " + (base * 2));           // utilise la locale
            System.out.println("Résultat global : " + (base * multiplicateur)); // utilise l’instance
        };

        r.run(); // exécution de la lambda
    }

    public static void main(String[] args) {
        List<String> noms = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> resultat = noms.stream()
                .filter(nom -> nom.startsWith("A"))

                .collect(Collectors.toList());
        System.out.println(resultat);


        BinaryOperator<Integer> addition = Integer::max;
        System.out.println(addition.apply(5, 3)); // Affiche 8


        Consumer<String> afficher = System.out::println;
        afficher.accept("Bonjour !");


        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.stream()
                .filter(n -> n.contains("i"))
                .forEach(System.out::println); // Affiche "Alice"


        calculer();


        //Prend un argument et retourne un booléen
        Predicate<String> estLong2 = s -> s.length() > 5;
        System.out.println("aa");
        //  On crée une liste de chaînes de caractères contenant trois prénoms. C’est notre source de données.
        List<String> nomes = Arrays.asList("Alice", "Charlie", "Bob");

        nomes.stream() // On crée un flux (Stream) à partir de la liste noms. Cela permet d’appliquer des opérations fonctionnelles sur les éléments de la liste.
                .filter(n -> n.length() > 3) // Opération intermédiaire : on filtre les noms dont la longueur est strictement supérieure à 3 caractères. Seuls les noms comme "Alice" et "Charlie" passeront ce filtre.
                .map(String::toUpperCase) // Opération intermédiaire : on filtre les noms dont la longueur est strictement supérieure à 3 caractères. Seuls les noms comme "Alice" et "Charlie" passeront ce filtre.
                .sorted() // Opération intermédiaire : on trie les noms restants par ordre alphabétique.
                .forEach(name -> {
                    estLong2.test(name);
                        }

                ); // Opération terminale : on affiche chaque nom dans la console.


        System.out.println("gb");
// filter() Garde les éléments qui respectent une condition
        List<String> fruits = List.of("Pomme", "Banane", "Orange", "Orange");
        List<String> upperFruits = fruits.stream()
                .map(String::toUpperCase)//Transforme chaque élément
                .distinct()//Supprime les doublons
                .filter(n ->n.length()>3)//Garde les éléments qui respectent une condition
                .sorted() //Trie les éléments
                .limit(5)//Garde les n premiers éléments
                .skip(0)  //Ignore les n premiers éléments
                .collect(Collectors.toList());

        /*
         forEach() :Applique une action à chaque élément
         collect(): Regroupe les éléments dans une collection
         count(): Compte le nombre d’éléments
         reduce(): Agrège les éléments en une seule valeur
         anyMatch() : Vérifie si au moins un élément correspond
         allMatch(): Vérifie si tous les éléments correspondent
         noneMatch(): Vérifie si aucun élément ne correspond
         findFirst(): Retourne le premier élément (optionnel)
        * */

        //reduce() –  Agrège les éléments en une seule valeur
        List<Integer> numbers = List.of(1, 2, 3, 4);
        int sum = numbers.stream().reduce(0, Integer::sum);

        System.out.println(upperFruits);
        System.out.println(sum);

        //Prend un argument et retourne un booléen
        Predicate<String> estLong = s -> s.length() > 5;

        System.out.println(estLong.test("Bonjour")); // true
        System.out.println(estLong.test("Salut"));   // false


       //Prend un argument et ne retourne rien
        Consumer<String> display= System.out::println;
        display.accept("Bonjour !");

        //Consumer<T> – Consommer une valeur(sans retour)
       //Prend une valeur et retourne une autre
        Function<String, Integer> longueur =String::length;

        System.out.println(longueur.apply("Hello")); // 5

         //Supplier<T> – Fournir une valeur (sans paramètre)
        //  Ne prend rien, mais retourne une valeur
        Supplier<Double> aleatoire =  Math::random;

        System.out.println("Nombre aléatoire : " + aleatoire.get());

    }
}

