package com.javademo.stringcharacter;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("\tcontent:" + sb.toString());
        System.out.println("\tinitial capacity: " + sb.capacity());
        System.out.println("\tinitial length: " + sb.length());

        sb.append("Hello World! Good Morning!");
        System.out.println("\tcontent:" + sb.toString());
        System.out.println("\tcapacity now: " + sb.capacity());
        System.out.println("\tlength now: " + sb.length());
        
        sb.ensureCapacity(128);
        System.out.println("\tcontent:" + sb.toString());
        System.out.println("\tcapacity now: " + sb.capacity());
        System.out.println("\tlength now: " + sb.length());

        sb.delete(0, sb.length());
        System.out.println("\tcontent:" + sb.toString());
        System.out.println("\tcapacity now: " + sb.capacity());
        System.out.println("\tlength now: " + sb.length());

        sb.append("Hello World! Good Morning!");
        System.out.println("\tcontent:" + sb.toString());
        System.out.println("\tsb.reverse(): " + sb.reverse());
        

    }
}
