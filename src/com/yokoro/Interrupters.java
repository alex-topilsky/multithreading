package com.yokoro;

public class Interrupters {

    public void start(){
        SimpleInterrupted simpleInterrupted = new SimpleInterrupted();

        Thread thread = new Thread(simpleInterrupted);
        thread.start();
        new Thread(() -> {
            System.out.println("Hello! I want to interrupt you! "+ getClass().getSimpleName() + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            simpleInterrupted.setStop(true);
        }).start();

    }

    class SimpleInterrupted implements Runnable {
        //example 1
//    @Override
//    public void run() {
//        do {
//            System.out.println("I still working " + getClass().getSimpleName() + " " + Thread.currentThread().getName());
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                System.out.println("Ohh no! I was interrupted :(");
//                break;
//            }
//        } while (!Thread.interrupted());
//    }


        //example 2
        private volatile boolean stop = false;

        @Override
        public void run() {
            do {
                if (!stop) {
                    System.out.println("I still working " + getClass().getSimpleName() + " " + Thread.currentThread().getName());

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Ohh no! I was stopped :(");
                    break;
                }
            } while (true);
        }

        public void setStop(boolean stop) {
            this.stop = stop;
        }
    }
}
