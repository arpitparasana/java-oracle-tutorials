package com.javademo.interfacedemo.inheritance;

// Implements Cloneable to support clone method
public class SuperClass implements Cloneable {
    public int i = 0;

    public SuperClass(){
        System.out.println("...constructing SuperClass");
    }

    public SuperClass(int i) {
        System.out.println("...constructing SuperClass with parameter");
        this.i = i;
    }

    public void printMethod(){
        System.out.println("Printed in SuperClass");
    }

    // SuperClass implements Cloneable interface
    // This super.clone() works fine as long as there are no reference type members in this class
    // If there are reference type members present (e.x. other objects), then they need to implement clone
    // as well so that they can be cloned here and assigned member of this class or they won't truly be indepedent
    // and the change in that external object will reflect in the clone of this object. This won't create a true clone in that case

    public SuperClass clone() throws CloneNotSupportedException {
        return (SuperClass)super.clone();
    }
}
