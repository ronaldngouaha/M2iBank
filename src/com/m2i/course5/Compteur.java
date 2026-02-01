package com.m2i.course5;

class Compteur {
    private int valeur = 0;



    public void incrementer() {
        valeur++; // NON synchronisé
    }


    public int getValeur() {
        return valeur;
    }
}
