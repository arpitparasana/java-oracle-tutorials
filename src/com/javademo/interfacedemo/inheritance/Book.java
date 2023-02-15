package com.javademo.interfacedemo.inheritance;

import java.util.Arrays;

public class Book {
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public Book(String ISBN) {
        this.ISBN = ISBN;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Book) {
            return getISBN().equals(((Book) o).getISBN());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        Book b1 = new Book("123");
        Book b2 = new Book("123");
        System.out.println("...b1 hash: " + b1.hashCode());
        System.out.println("...b2 hash: " + b2.hashCode());
        System.out.println("..." + b1.equals(b2));

        // demo of few methods of Class using getClass()
        System.out.println(b1.getClass().getSuperclass());
        System.out.println(b1.getClass().getClassLoader());
        System.out.println(b1.getClass().getCanonicalName());
        System.out.println(b1.getClass().toGenericString());

        System.out.println("...Methods of class: " + b1.getClass().getSimpleName());
        Arrays.asList((b1.getClass().getMethods())).stream().forEach(System.out::println);
        
        System.out.println("...Fields of class: " + b1.getClass().getSimpleName());
        Arrays.asList(b1.getClass().getFields()).stream().forEach(System.out::println);

    }
}
