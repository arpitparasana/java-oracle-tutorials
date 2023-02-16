package com.javademo.stringcharacter;

import java.util.Arrays;

public class AnagramDemo {

    public static void main(String[] args) {
        System.out.println(isAnagram("1 error!", "error 1"));
        System.out.println(isAnagram("Good Morning, John", "john! good morning."));
        System.out.println(isAnagram("you go up!", "up you go."));
        System.out.println(isAnagram("park eat", "take part"));
    }
    
    public static boolean isAnagram(String s1, String s2) {
        s1 = sort(clean(s1));
        s2 = sort(clean(s2));
        return s1.equalsIgnoreCase(s2);
    }

    public static String clean(String s) {
        StringBuilder sb = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public static String sort(String s) {
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        return new String(cArr);
    }
}
