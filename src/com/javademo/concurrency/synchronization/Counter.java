package com.javademo.concurrency.synchronization;

public class Counter {
    
    private Integer c = 0;

    void increment() {
        c++;
        System.out.println("...incremented: " + getValue());
    }

    void decrement() {
        c--;
        System.out.println("...decremented: " + getValue());
    }

    public int getValue(){
        return c;
    }
}
