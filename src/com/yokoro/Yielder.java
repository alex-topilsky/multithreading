package com.yokoro;

public class Yielder {
    private Thread t1 = new Thread(new Y1());
    private Thread t2 = new Thread(new Y2());

     void start() {
        t1.start();
        t2.start();
    }

    class Y1 implements Runnable {
        @Override
        public void run() {
            int i = 0;
            do {
                System.out.println("Hello from yield i=" + i + " " + getClass().getSimpleName() + " " + Thread.currentThread().getName());
                i++;
                Thread.yield();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                    break;
                }
                if(Thread.interrupted()) System.out.println("GGGG");
            } while (i < 50);
            t2.interrupt();
        }
    }

    class Y2 implements Runnable {
        @Override
        public void run() {
            int i = 0;
            do {
                System.out.println("Hello from yield i=" + i + " " + getClass().getSimpleName() + " " + Thread.currentThread().getName());
                i++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                    break;
                }
            } while (i < 5);
            t1.interrupt();
        }
    }
}
