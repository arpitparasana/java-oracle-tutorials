package com.javademo.string;

/**
 * Interesting question on SO on difference between \n and \r:
 * https://stackoverflow.com/questions/1761051/difference-between-n-and-r
 */
public class StringCodepointsMiscDemo {
    public static void main(String[] args) {
        String s1 = "H" + System.lineSeparator() + "G" + System.lineSeparator() + "M"; // same as H\nG\nM
        String s2 = "H\rG\rM"; // \n is counted as one codepoint though this is plateform dependent
        // (Linux/Mac/Windows will give us different results)
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s1 length: " + s1.length());
        System.out.println("s2 length: " + s2.length());
        System.out.println("s1 length using codepoints: " + s1.codePoints().toArray().length);
        System.out.println("s2 length using codepoints: " + s2.codePoints().toArray().length);

        System.out.println("s1 code points: ");
        for (int i : s1.codePoints().toArray())
            System.out.println(i);

        System.out.println("s2 code points: ");
        for (int i : s2.codePoints().toArray())
            System.out.println(i);
    }
}
