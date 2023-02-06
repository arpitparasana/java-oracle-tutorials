package com.javademo.interfacedemo.defaultstaticdemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SimpleTimeClient implements TimeClient {
    private LocalDateTime dateTime;

    public SimpleTimeClient(){
        dateTime = LocalDateTime.now();
    }
    
    @Override
    public LocalDateTime getLocalDateTime() {
        return dateTime;
    }

    @Override
    public void setDate(int year, int month, int day) {
        dateTime = LocalDateTime.of(LocalDate.of(year, month, day), LocalTime.from(dateTime));
    }

    @Override
    public void setTime(int hour, int minute, int second) {
       dateTime = LocalDateTime.of(LocalDate.from(dateTime), LocalTime.of(hour, minute, second));
    }
    
    @Override
    public void setDateTime(int year, int month, int day, int hour, int minute, int second) {
        dateTime = LocalDateTime.of(LocalDate.of(year, month, day), LocalTime.of(hour, minute, second));
    }

    @Override
    public String toString() {
        return dateTime.toString();
    }
}
