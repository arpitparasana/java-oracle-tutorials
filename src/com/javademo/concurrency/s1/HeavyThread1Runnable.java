package com.javademo.concurrency.s1;

public class HeavyThread1Runnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("...hello world from thread: " + Thread.currentThread().getName());
        }
    }
}
