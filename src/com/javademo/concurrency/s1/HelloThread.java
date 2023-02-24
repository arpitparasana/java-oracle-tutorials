package com.javademo.concurrency.s1;

public class HelloThread extends Thread {

    public static void main(String[] args) {
        new Thread(new HelloThread()).start();
    }

    @Override
    public void run() {
        System.out.println("Hello from controlled Thread!");
    }
}
