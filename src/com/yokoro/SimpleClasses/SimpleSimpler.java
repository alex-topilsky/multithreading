package com.yokoro.SimpleClasses;

public class SimpleSimpler {

    public void run(){
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getName());
    }
}
