package com.javademo.concurrency.s1;

public class HeavyThread2Runnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Good Morning from thread 2");
        }
    }
}
