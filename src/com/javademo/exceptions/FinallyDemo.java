package com.javademo.exceptions;

public class FinallyDemo {

    // Demo to show that finally always gets executed (except when JVM exits while
    // try or catch is running), this is to ensure that resource cleanup logic after
    // expensive operation is not by passed in any case
    public static void main(String[] args) {
        try {
            if (true) {
                return;
            }
        } finally {
            System.out.println("releasing resources...");
        }
    }
}
