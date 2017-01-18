package com.yokoro.SimpleClasses;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getName());
    }
}
