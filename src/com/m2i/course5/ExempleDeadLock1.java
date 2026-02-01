package com.m2i.course5;

class Chaise {}
class Table {}

public class ExempleDeadLock1 {
    static final Chaise chaise = new Chaise();
    static final Table table = new Table();

    public static void main(String[] args) {
        Thread alice = new Thread(() -> {
            synchronized (chaise) {
                System.out.println("Alice a la chaise");
                try { Thread.sleep(10); } catch (InterruptedException ignored) {}
                synchronized (table) {
                    System.out.println("Alice a la table");
                }
            }
        });

        Thread bob = new Thread(() -> {
            synchronized (table) {
                System.out.println("Bob a la table");
                try { Thread.sleep(10); } catch (InterruptedException ignored) {}
                synchronized (chaise) {
                    System.out.println("Bob a la chaise");
                }
            }
        });

        alice.start();
        bob.start();




    }
}

