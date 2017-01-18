package com.yokoro.SimpleClasses;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getName());
    }
}
