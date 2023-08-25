package com.javademo.async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculatorAsync {
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<Integer> calculate(int i) {
        return executor.submit(() -> {
            Thread.sleep(2000);
            return i*i;
        });
    }
}
