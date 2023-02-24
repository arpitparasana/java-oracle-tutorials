package com.javademo.concurrency.synchronization;

/**
 * synchronized method declaration
 */
public class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment(){
        c++;
        System.out.println("...incremented: " + getValue());
    }

    public synchronized void decrement(){
        c--;
        System.out.println("...decremented: " + getValue());
    }

    public synchronized int getValue(){
        return c;
    }
}
