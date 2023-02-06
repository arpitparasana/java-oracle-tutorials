package com.javademo.interfacedemo.defaultstaticdemo;

public class TimeMain {
    public static void main(String[] args) {
        SimpleTimeClient sTimeClient = new SimpleTimeClient();

        System.out.println(sTimeClient.toString());

        System.out.println(sTimeClient.getZonedDateTime("G"));
        System.out.println(sTimeClient.getZonedDateTime(null));

    }
}
