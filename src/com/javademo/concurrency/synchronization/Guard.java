package com.javademo.concurrency.synchronization;

public class Guard {

    private boolean guard = false;

    public synchronized void isGuardTrue() {
        while (!guard) {
            try {
                System.out.println("...waiting for guard to be set: " + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("...guard has been set: " + Thread.currentThread().getName());
    }

    public synchronized void setGuard(boolean guard) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...setting guard: " + Thread.currentThread().getName());
        this.guard = guard;
        notifyAll();
    }
}
