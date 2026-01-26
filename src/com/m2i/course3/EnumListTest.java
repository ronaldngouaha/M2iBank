package com.m2i.course3;

public class EnumListTest {

    public static void main(String[] args) {
        Saison saison = Saison.HIVER;
     // saison.ordinal() recupere la position dans l'ennumeration
      //  saison.name() renvoit le nom de l'enum dans la liste
        System.out.println("Saison : " + saison);
        System.out.println("Température : " + saison.getTemperature());
    }

}


enum Saison {
    PRINTEMPS("Doux"),
    ETE("Chaud"),
    AUTOMNE("Frais"),
    HIVER("Froid");

    private final String temperature; // Attribut

    // Constructeur
    Saison(String temperature) {
        this.temperature = temperature;
      }

    public String getTemperature() {
        return temperature;
    }

}
