package com.javademo.concurrency.s1;

public class HeavyThreadMainDemo {
    public static void main(String[] args) {
        System.out.println("...main thread: " + Thread.currentThread().getName());
        Thread t0 = new Thread(new HeavyThread1Runnable());
        Thread t1 = new Thread(new HeavyThread2Runnable());
        t0.start();
        t1.start();
        
        // when a thread which spawns other threads (main spawning t1 and t2 here) 
        // calls join on any of these threads, that means it will wait until these threads
        // are finished executing before continuing.
        try {
            t0.join();
            t1.join();
        } catch(InterruptedException e) {
            return;
        }
        System.out.println("...continuing main after t0 and t1 finished");
        
        System.out.println("...starting 2 new threads...");
        Thread t2 = new Thread(new HeavyThread1Runnable());
        Thread t3 = new Thread(new HeavyThread2Runnable());

        t2.start();
        
        try {
            t2.join();
        } catch(InterruptedException e){
            return;
        }        
        
        t3.start();

        System.out.println("...main finished after joining t2");
    }
}
