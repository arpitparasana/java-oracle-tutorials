package com.javademo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Conversion contructor demo + some other Collectins API demo
 */
public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        Set<String> suit =  new HashSet<>();
        suit.add("Diamond");
        suit.add("Heart");
        suit.add("Club");
        suit.add("Spades");
        suit.add("Spades");

        List<String> array1 = new ArrayList<>(suit);
        List<String> array2 = new ArrayList<>(array1);
        
        array1.add("TestInArray1");
        array2.add("TestInArray2");

        System.out.println(suit);
        System.out.println(array1);
        System.out.println(array2);

        System.out.println(array1.containsAll(suit));
        System.out.println(array1.containsAll(array2));
        
        // restore to original copies using retain all
        array1.retainAll(suit);
        array2.retainAll(suit);

        System.out.println(suit);
        System.out.println(array1);
        System.out.println(array2);
    }
}
