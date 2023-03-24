package com.javademo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AggregateOperationsDemo {
    
    public static void main(String[] args) {
        List<Suit> suit =  new ArrayList<>();
        suit.add(Suit.HEARTS);
        suit.add(Suit.SPADES);
        suit.add(Suit.CLUBS);
        suit.add(Suit.DIAMONDS);

        String joined = suit.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(joined);
    }
}

enum Suit {
    DIAMONDS,
    HEARTS,
    CLUBS,
    SPADES
}
