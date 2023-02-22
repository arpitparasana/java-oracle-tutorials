package com.javademo.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class LambdaDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(121, 1221, 34, 45, 56, 67, 78, 89, 97, 7, 66, 73);

        int count = countIf(list, t -> t != null ? t % 2 == 0 : false);
        System.out.println("...count of evens: " + count);

        count = countIf(list, t -> t != null? t % 2 != 0 : false);
        System.out.println("...count of odds: " + count);

        count = countIf(list, t -> {
            if(t == null)
                return false;
            if (t < 2)
                return false;
            for (int i = 2; i < t; i++) {
                if (t % i == 0) {
                    return false;
                }
            }
            return true;
        });

        System.out.println("...count of primes: " + count);

        count = countIf(list, LambdaDemo::checkPalindrome);
        System.out.println("...count of palindrome: " + count);

    }

    public static <T> int countIf(Collection<T> list, Predicate<T> p) {
        int count = 0;
        for (T t : list) {
            if (p.test(t))
                ++count;
        }
        return count;
    }

    public static boolean checkPalindrome(Object str) {
        if (str != null && str.toString().length() > 0) {
            if(str.toString().length() == 1) 
                return true;
            int sb1end = str.toString().length() % 2 == 0 ? str.toString().length() / 2 : (str.toString().length()/2) + 1;
            StringBuilder sb1 = new StringBuilder(str.toString().substring(0, sb1end));
            StringBuilder sb2 = new StringBuilder(str.toString().substring(str.toString().length() / 2));
            return sb1.toString().equals(sb2.reverse().toString());
        }
        return false;
    }
}
