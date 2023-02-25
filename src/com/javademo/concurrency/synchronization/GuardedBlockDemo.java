package com.javademo.concurrency.synchronization;

/**
 * demo to show how to use guarded block using wait() and notify()/notifyAll()
 * in case when one thread needs to wait for another thread's action but
 * should release the intrinsic lock on current synchronized block so that
 * this synchronized block is released and can be used by other threads
 * while it waits. When this wait() depends on some condition, this thread is
 * normally notified when that condition is set by other thread by invoking
 * notify()/notifyAll()
 */
public class GuardedBlockDemo {

    public static void main(String[] args) {
        Guard g = new Guard();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                g.isGuardTrue();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("...working on setting guard: " + Thread.currentThread().getName());
                g.setGuard(true);
            }
        });

        t1.start();
        t2.start();
    }
}
