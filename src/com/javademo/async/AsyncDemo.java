package com.javademo.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsyncDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        SquareCalculatorAsync c = new SquareCalculatorAsync();
        int i = 67678;
        Future<Integer> result = c.calculate(i);
        System.out.print("Calculating square of " + i);
        while(!result.isDone()) {
            System.out.print(".");
            Thread.sleep(200);
        }
        System.out.println();
        System.out.println(result.get().intValue());
    }
}
