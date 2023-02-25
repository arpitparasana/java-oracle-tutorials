package com.javademo.concurrency.s1;

public class HelloRunnable implements Runnable {

    public static void main(String[] args) {
        new Thread(new HelloRunnable()).start();
    }

    /**
     * Implementing Runnable interface is preferred way of starting a thread over
     * extending Thread class so that
     * class can be a subclass of other class which in most cases is required (class
     * can only extend one class though can implement many interfaces)
     */
    @Override
    public void run() {
        System.out.println("Hello World from controlled Thread!");
    }
}
