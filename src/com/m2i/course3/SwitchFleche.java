package com.m2i.course3;


public class SwitchFleche {


    /*
    Ne nécessite pas de break.

Permet d’assigner directement une valeur à une variable.

Améliore la lisibilité et réduit le code répétitif.

Moins de code : plus besoin de break.

Plus lisible et fonctionnel.

     */
    public static void main(String[] args) {
        int day = 3;

        String dayName = switch (day) {
            case 1 -> "Lundi";
            case 2 -> "Mardi";
            case 3 -> "Mercredi";
            default -> "Jour inconnu";
        };

        System.out.println(dayName);




        String days="Mardi";
        int dayIndex = switch (days) {
            case "Lundi" -> 1;
            case "Mardi"-> 2;
            case "Mercredi" ->3 ;
            default -> 0;
        };


        System.out.println("Day index = "+dayIndex);
    }
}
