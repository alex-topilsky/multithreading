package com.yokoro;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Start from Main" + " " + Thread.currentThread().getName());

//        new Interrupters().start();

//        new Yielder().start();

//        new Daemons().start();

//        new StartOfThread().start();

//        new Waiters().start();

//        new Joiners().start();

//        new Synchronizes().start();

        new Priorities().start();

        System.out.println("Finish from Main" + " " + Thread.currentThread().getName());
    }
}
