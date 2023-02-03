package com.javademo.interfacedemo;

public class InterfaceDemo {
    
    public static void main(String[] args) {
        Book b1 = new Book(310);
        Book b2 = new Book(300);

        System.out.println(b1.isLargerThan(b2));
    }
}
