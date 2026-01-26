package com.m2i.course4;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptJava {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine moteur = manager.getEngineByName("JavaScript");
        try {
            moteur.eval("var nom = 'Jean'; print('Bonjour ' + nom);");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
