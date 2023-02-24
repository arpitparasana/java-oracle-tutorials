package com.javademo.concurrency.s1;

public class HelloRunnable implements Runnable {

    public static void main(String[] args) {
        new Thread(new HelloRunnable()).start();
    }

    @Override
    public void run() {
        System.out.println("Hello World from controlled Thread!");
    }
}
