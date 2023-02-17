package com.javademo.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
 * #1 Generics
 * #2 Type Inference
 * #3 Lambda, Inner class, effectively final variables, IntStream
 */
public class BoxDemo {
    
    public static void main(String[] args) {
        List<Box<Integer>> boxOfIntegers = new ArrayList<>();
        addBox(Integer.valueOf(10), boxOfIntegers);
        addBox(Integer.valueOf(20), boxOfIntegers);
        addBox(Integer.valueOf(30), boxOfIntegers);
        
        displayBoxes(boxOfIntegers);
    }

    // Type inference will infer at compile time that U is Integer and 'boxes' is a list of Integers
    public static <U> void addBox(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.setT(u);
        boxes.add(box);
    }

    public static <U> void displayBoxes(List<Box<U>> boxes){
        
        // local variables inside lambda or anonymous classes need to be final or effectively final (assigned once and never changed).
        // However, this "final" rule applies to the "reference" pointer only and not the value that the reference points to
        // As shown below, j's reference is not changed inside forEach but the value at 0th position can be changed and used as an index 
        Integer[] j = new Integer[]{1};
        boxes.stream().forEach((b) -> {
            System.out.println("Box "+ (j[0]++) + " => " + b.getT());
        });


        // other way of capturing index inside forEach using InstStream
        IntStream.range(0, boxes.size())
            .mapToObj(i -> new String("Box "+ (i+1) + " => " + boxes.get(i).getT()))
            .forEach(System.out::println);
    }
}
