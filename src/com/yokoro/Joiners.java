package com.yokoro;

import com.yokoro.SimpleClasses.SimpleRunnable;
import com.yokoro.SimpleClasses.SimpleThread;

public class Joiners {

    void start() throws Exception {
        SimpleThread simpleThread = new SimpleThread();
        SimpleRunnable simpleRunnable = new SimpleRunnable();

        Thread thread1 = new Thread(simpleThread);
        Thread thread2 = new Thread(simpleRunnable);
        System.out.println(getClass().getSimpleName() + " start " + Thread.currentThread().getName());
        thread2.start();
        thread2.join(); //Main thread will wait of ending of thread2
        //thread2.join(2000); //Wait 2 sec. If it isn't end Current tread will continue
        thread1.start();
        System.out.println(getClass().getSimpleName() + " finish " + Thread.currentThread().getName());
    }
}
