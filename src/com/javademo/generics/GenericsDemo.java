package com.javademo.generics;

import java.util.Arrays;
import java.util.List;
import java.lang.Comparable;

public class GenericsDemo {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setT(23);

        Box<String> stringBox = new Box<>();
        stringBox.setT("Hello World!");

        System.out.println(add(3, 6));
        System.out.println(add(3.45, 6.45));
        System.out.println(add(45L, 46L));
        System.out.println(add(45.45f, 78.34f));

        List<Integer> intList = Arrays.asList(1, 3, 5, 6, 7);
        List<Double> doubleList = Arrays.asList(23.45, 45.75, 78.78, 89.57);
        List<Character> characterList = Arrays.asList('C', 'f', 'g', 'F');
        List<String> stringList = Arrays.asList("test1", "test5", "test4", "test8", "test0");

        System.out.println(countGreaterThan(intList, 4));
        System.out.println(countGreaterThan(doubleList, 40.78));
        System.out.println(countGreaterThan(characterList, 'b'));
        System.out.println(countGreaterThan(stringList, "test4"));

    }

    public static <N extends Number> double add(N a, N b) {
        double sum = 0;
        System.out.println("Adding types: " + a.getClass().getSimpleName());
        sum = a.doubleValue() + b.doubleValue();
        return sum;
    }

    public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T e) {
        int c = 0;
        for (T t : list) {
            if (t.compareTo(e) > 0) {
                c++;
            }
        }
        return c;
    }
}
