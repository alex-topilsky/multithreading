package com.yokoro;


public class Daemons{

    public void start(){
        SimpleDaemon sd1 = new SimpleDaemon();

        Thread t1 = new Thread(sd1);
        Thread t2 = new Thread(sd1);

        t1.setDaemon(true);
        t1.start();
//        t2.start();
    }

    class SimpleDaemon implements Runnable {
        @Override
        public void run() {
            do {
                System.out.println("I still alive! " + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (true);
        }
    }
}
