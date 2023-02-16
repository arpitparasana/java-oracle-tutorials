package com.javademo.generics;

public class GenericsDemo {
    
    public static void main(String[] args) {
        Box<Integer> integerBox =  new Box<>();
        integerBox.setT(23);

        Box<String> stringBox = new Box<>();
        stringBox.setT("Hello World!");

        System.out.println(add(3,6));
        System.out.println(add(3.45, 6.45));
        System.out.println(add(45L, 46L));
        System.out.println(add(45.45f, 78.34f));
    }

    public static <N extends Number> double add(N a, N b){
        double sum  = 0;
        System.out.println("Adding types: " + a.getClass().getSimpleName());
        sum = a.doubleValue() + b.doubleValue();
        return sum;
    }
}
