package com.javademo.exceptions;

public class BasicExceptionDemo {

    public static void main(String[] args) {

        // when performing division operation we normally get result
        // except when we divide a number by 0, which if not caught
        // program will terminate and won't continue the rest of the
        // try block
        for (int i = -2; i < 3; i++) {
            try {
                System.out.println(10 / i);
            } catch (ArithmeticException e) {
                System.out.println("...exception: " + e.getLocalizedMessage());
            }
        }
    }
}
