package com.javademo.concurrency.synchronization;

/**
 * if instance methods are declared to be sychronized, two invocation on that same method
 * will not interfer with one another as once the synchronized method is called, its locked 
 * for use until the thread that called it is done with it. Unlike ThreadInterferenceDemo
 * where Counter (with not synchronized methods) is used, the result of SynchronizedCounter
 * will be as expected
 */
public class SynchronizedMethodsDemo {
    public static void main(String[] args) {
        SynchronizedCounter c = new SynchronizedCounter();

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
