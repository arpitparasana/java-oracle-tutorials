package com.javademo.scheduling;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class SimpleTimerTaskDemo {
    
    public static void main(String[] args) {
        Timer timer =  new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("beep " + LocalDateTime.now());
            }
        };

        timer.scheduleAtFixedRate(timerTask, 0, 5000);
    }
}
