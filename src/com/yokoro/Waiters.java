package com.yokoro;

class Waiters {
    void start() throws Exception {
        Waiter1 w1 = new Waiter1();
        Waiter2 w2 = new Waiter2();
        Waiter3 w3 = new Waiter3();

//        new Thread(w1).start();
//        new Thread(w1).start();

//        new Thread(w2).start();
//        new Thread(w2).start();

        new Thread(w3).start();
        new Thread(w3).start();
    }

    class Waiter1 implements Runnable {
        @Override
        synchronized public void run() {
            try {
                System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getName());
                notify();
                wait();
                Thread.sleep(5000);
                System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getName());
                notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Waiter2 implements Runnable {
        @Override
        synchronized public void run() {
            try {
                System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getName());
                notify();
                wait(2000);
                Thread.sleep(10000);
                System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getName());
                notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Waiter3 implements Runnable {
        @Override
        synchronized public void run() {
            try {
                System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
