package com.yokoro.SimpleClasses;

import java.util.concurrent.Callable;

public class SimpleCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getName());
        return 5;
    }
}
