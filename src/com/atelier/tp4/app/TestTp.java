package com.atelier.tp4.app;

import com.atelier.tp4.utils.Calculatrice;

public class TestTp  {

    public static void  main(String[] args){

        Calculatrice calculatrice = new Calculatrice();

        int a=2; int b=399;
        System.out.println(String.format("->> Result addition %d + %d = %d", a, b,calculatrice.addition(a,b)));


        double c=92.394; double d=3.99;

        System.out.println(String.format("->> Result addition %f + %f = %f ", c, d,calculatrice.addition(c,d)));


        int e=994;
        System.out.println(String.format("->> Result addition %d + %d + %d = %d ", a, b,e, calculatrice.addition(a,b,e)));



    }



}
