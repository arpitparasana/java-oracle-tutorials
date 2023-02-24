package com.javademo.concurrency.s1;

public class HeavyThreadMainDemo {
    public static void main(String[] args) {
        System.out.println("...main thread: " + Thread.currentThread().getName());
        Thread t1 = new Thread(new HeavyThread1Runnable());
        Thread t2 = new Thread(new HeavyThread2Runnable());
        t1.start();
        t2.start();
        
        // when a thread which spawns other threads (main spawning t1 and t2 here) 
        // calls join on any of these threads, that means it will wait until these threads
        // are finished executing before continuing.
        try {
            t1.join();
            t2.join();
        } catch(InterruptedException e) {
            return;
        }
        System.out.println("...continuing main after t1 and t2 finished");
        
        System.out.println("...starting 2 new threads...");
        Thread t3 = new Thread(new HeavyThread1Runnable());
        Thread t4 = new Thread(new HeavyThread2Runnable());

        t3.start();
        
        try {
            t3.join();
        } catch(InterruptedException e){
            return;
        }        
        
        t4.start();

        System.out.println("...main finished after joining t3");
    }
}
