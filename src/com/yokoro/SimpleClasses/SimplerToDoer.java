package com.yokoro.SimpleClasses;

public class SimplerToDoer implements Runnable {
    String string = "Lock";

    @Override
    public void run() {
        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized static private void method1() throws InterruptedException {
        System.out.println("Method1 started!" + " " + Thread.currentThread().getName());
        Thread.sleep(3000);
        System.out.println("Method1 is synchronized" + " " + Thread.currentThread().getName());
        Thread.sleep(3000);
        System.out.println("Method1 finished!" + " " + Thread.currentThread().getName());
    }

    synchronized private void method2() throws InterruptedException {
        System.out.println("Method2 started!"+ " " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("Method2 is synchronized"+ " " + Thread.currentThread().getName());
            Thread.sleep(5000);
        System.out.println("Method2 finished!" + " " + Thread.currentThread().getName());
    }

    private void method3() {

    }
}
