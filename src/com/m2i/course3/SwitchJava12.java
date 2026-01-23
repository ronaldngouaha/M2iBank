package com.m2i.course3;

public class SwitchJava12 {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Lundi";
                break;
            case 2:
                dayName = "Mardi";
                break;
            case 3:
                dayName = "Mercredi";
                break;
            default:
                dayName = "Jour inconnu";
        }
        System.out.println(dayName);

        String days="Mardi"; int dayIndex;
        switch (days){
            case "Lundi":
                dayIndex=1;
                break;
            case "Mardi":
                dayIndex=2;
                break;
            case "Mercredi":
                dayIndex=3;
                break;
            default:
                dayIndex=0;
        }

        System.out.println("Day index = "+dayIndex);
    }



}
