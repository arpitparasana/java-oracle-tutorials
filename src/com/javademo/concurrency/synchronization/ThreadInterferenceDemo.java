package com.javademo.concurrency.synchronization;

/**
 * Demo to show thread interference. Counter methods are not declared Synchronized
 * so if two threads share the same instance of counter, and uses their methods which
 * changes the state of Counter, the results might be unexpected
 */

public class ThreadInterferenceDemo {
    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                
                for(int i=0; i<3; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                
                for(int i=0; i<3; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }    
                    c.decrement();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
