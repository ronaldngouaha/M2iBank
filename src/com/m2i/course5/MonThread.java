package com.m2i.course5;

class MonThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread en cours d’exécution");
    }

    public static void main(String[] args) {
        MonThread t = new MonThread();
        t.start(); // Démarre le thread
    }
}

