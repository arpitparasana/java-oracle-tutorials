package com.javademo.interfacedemo.inheritance.abstractdemo;

// demo to show that abstract class does not need to implement all the abstract methods of an interface
// however, if method is not implemented in abstract class, subclass is forced to implement it
// Graphic abstract class implements Removable interface, but does not implement the method remove()
// Circle class here must implement it if it extends Graphic class

public class Circle extends Graphic {
    
    @Override
    void draw() {
        System.out.println("...drawing circle");
    }

    @Override
    void resize() {
        System.out.println("...resizing circle");
    }

    @Override
    public void remove() {
        System.out.println("...removing circle");
    }
    
}
