package com.javademo.innerclass.math;

// static import of Math utilities
import static java.lang.Math.*;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println("...base of natural logarithm: " + E);
        System.out.println("...value of PI: " + PI);
        System.out.println("...absolute value of -34.87: " + abs(-34.87));
        System.out.println("...ceiling value of 45.44: " + ceil(45.44));
        System.out.println("...floor value of 45.44: " + floor(45.44));
        System.out.println("...round value of 78.97: " + round(78.97));
        System.out.println("...round value of 78.30 float: " + round(78.30f));

        System.out.println("...base of the natural logarithm to the power of 2: " + exp(2));
        System.out.println("...log of the 7.38905609893065: " + log(7.38905609893065));

        System.out.println("...tangent of degree 45 is: " + round(tan(toRadians(45))));

        System.out.println("...random value picked using Math.random: " + random());
    }
}
