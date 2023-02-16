package com.javademo.stringcharacter;

public class StringAndCharacterDemo {
    public static void main(String[] args) {
        System.out.println("...Constructing String demo");
        String h1 = "Hello";
        String h2 = "Hello";
        String h3 = new String("Hello");

        // Comparing the references of h1, h2 & h3, 
        // h1 and h2 points to the same string in String Pool (special memory in heap) so returns true.
        // Creating String with 'new' keyword creates an object in common memory in heap with other objects.
        // In practice, however, we create String(s) in java using normal assignment (without new keyword) to
        // leverage String pool features for efficient memory management and performance.
        System.out.println("\th1 == h2: " + (h1 == h2));
        System.out.println("\th1 == h3: " + (h1 == h3));

        // This subtle, though completely unnecessary, way of interning strings h4 & h5 achieves the same thing 
        // as normal assingment of strings does using assingment operator
        String h4 = new String("World").intern();
        String h5 = new String("World").intern();
        String h6 = "World";
        
        System.out.println("\tif used intern() on \"new\" Strings, h4 == h5: " + (h4 == h5));
        System.out.println("\th5 == h6: " + (h5 == h6));
        System.out.println("\t" + h4.hashCode() + " " + h5.hashCode() + " " + h6.hashCode());


        // String Seaching and Manipulation demo
        System.out.println("...Searching and Manipulating demo");
        String pal = "evil olive";
        System.out.println("\t5th character in " + pal + ": " + pal.charAt(5));
        System.out.println("\tpal.substring(4): " + pal.substring(4));
        System.out.println("\tpal.substring(3,7): " + pal.substring(3,7));

        String con = "John1Jane2Albert3James";

        String[] names = con.split("[0-9]");
        System.out.println("\tafter split, names[2]: " + names[2]);

        System.out.println("\tpal.indexOf('v'): " + pal.indexOf('v'));
        System.out.println("\tpal.contains(\"l ol\"): " + pal.contains("l ol"));

        System.out.println("\tpal.replace('l','L'): " + pal.replace('l','L'));
        System.out.println("\tpal.replaceFirst(\"l\",\"L\"): " + pal.replaceFirst("l","L"));

        // Comparisons
        System.out.println("...String comparison demo");
        System.out.println("\tpal.equalsIgnoreCase(con): " + pal.equalsIgnoreCase(con));
        System.out.println("\tpal.endsWith(\"ve\"): " + pal.endsWith("ve"));

        // compareTo compares strings lexicographically, it is case sensitive comparison (compareToIgnoreCase ignores case)
        System.out.println("\th1.compareTo(h4): " + h1.compareTo(h4));
        System.out.println("\th1.compareTo(h1.toLowerCase()): " + h1.compareTo(h1.toLowerCase()));
        System.out.println("\th1.compareTo(h1.toUpperCase()): " + h1.compareTo(h1.toUpperCase()));

        
        // Character class usage demo
        System.out.println();
        System.out.println("...Character class demo");
        Character c = new Character('a');

        System.out.println("\tCharacter.toUpperCase(c): " + Character.toUpperCase(c));
        System.out.println("\tCharacter.isWhitespace(c): " + Character.isWhitespace(c));
        System.out.println("\tCharacter.isLetter(c): " + Character.isLetter(c));
        System.out.println("\tCharacter.isDigit(c): " + Character.isDigit(c));
    }
}
