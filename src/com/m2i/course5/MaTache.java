package com.m2i.course5;

class MaTache implements Runnable {
    @Override
    public void run() {
        System.out.println("Tâche exécutée par un thread");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MaTache());
        t.start();
    }
}
