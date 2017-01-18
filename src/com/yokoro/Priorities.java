package com.yokoro;

public class Priorities {

    public void start() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000_0000; i++) {
                double d1 = Math.sqrt(2);
                double d2 = Math.sqrt(2);
                double d3 = Math.sqrt(2);
                double d4 = Math.sqrt(2);
            }
            System.out.println("1 wins: " + getClass().getSimpleName() + " " + Thread.currentThread().getName());
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000_0000; i++) {
                double d1 = Math.sqrt(2);
                double d2 = Math.sqrt(2);
                double d3 = Math.sqrt(2);
                double d4 = Math.sqrt(2);
            }
            System.out.println("2 wins: " + getClass().getSimpleName() + " " + Thread.currentThread().getName());
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100_000_0000; i++) {
                double d1 = Math.sqrt(2);
                double d2 = Math.sqrt(2);
                double d3 = Math.sqrt(2);
                double d4 = Math.sqrt(2);//123
            }
            System.out.println("3 wins: " + getClass().getSimpleName() + " " + Thread.currentThread().getName());
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
