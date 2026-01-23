package com.m2i.course3;

public class TableauMulti {
    public static void main(String[] args) {
        // Tableau à 2 Dimensions (Matrice)
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrice[1][2]); // Affiche 6
        // Parcourir un Tableau à 2D
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
