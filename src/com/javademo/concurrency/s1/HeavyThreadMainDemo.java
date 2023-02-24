package com.javademo.concurrency.s1;

public class HeavyThreadMainDemo {
    public static void main(String[] args) {
        new Thread(new HeavyThread1Runnable()).start();
        new Thread(new HeavyThread2Runnable()).start();
    }
}
