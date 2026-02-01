package com.m2i.course5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/*
❗Problème

Les opérations non atomiques sur des structures partagées peuvent provoquer des erreurs (ex. lire pendant qu’un autre écrit).

✅ Solution

Utiliser des structures thread-safe:
Collections concurrentes
Wrappers synchronisés
Variables/Classes atomiques

* */
public class ExempleDataInc {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 10;i++) {
                map.put("clé" + i, "valeur" + i);
            }
        });
        Thread reader = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(map.get("clé" + i)); // risque d'incohérence
            }
        });
        writer.start();
        reader.start();
    }
}
