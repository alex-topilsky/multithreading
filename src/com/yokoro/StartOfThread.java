package com.yokoro;

import com.yokoro.SimpleClasses.SimpleCallable;
import com.yokoro.SimpleClasses.SimpleRunnable;
import com.yokoro.SimpleClasses.SimpleThread;

import java.util.concurrent.*;

class StartOfThread {

    void start() throws Exception {
        SimpleThread simpleThread = new SimpleThread();
        SimpleRunnable simpleRunnable = new SimpleRunnable();
        SimpleCallable simpleCallable = new SimpleCallable();
        FutureTask<Integer> task = new FutureTask<>(simpleCallable);
        ExecutorService executor = Executors.newFixedThreadPool(1);

//        new Thread((Runnable) new SimpleSimpler()).start(); // Error, because it doesn't implement Runnable
        simpleRunnable.run();
        simpleThread.start();
        new Thread(simpleRunnable).start();
        new Thread(task).start();
        Integer i = task.get() ;
        if (i != null) {
            System.out.println("from FutureTask: i = " + i);
        }
        executor.submit(simpleCallable);
    }

}
