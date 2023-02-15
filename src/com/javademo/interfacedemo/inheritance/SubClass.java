package com.javademo.interfacedemo.inheritance;

public class SubClass extends SuperClass {
    
    // this contructor will internally call a Super class's default constructor 
    public SubClass(){
        System.out.println("...constructing SubClass");
    }

    // this super(i) will call a parameterized constructor of a super class
    public SubClass(int i){
        super(i);
        System.out.println("...constructing SubClass with parameter");
    }
    
    public void printMethod(){
        super.printMethod();
        System.out.println("Printed in SubClass");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        SubClass sc =  new SubClass();
        sc.printMethod();
        sc =  new SubClass(1);

        SuperClass superclass = new SuperClass(12);

        SuperClass clone = superclass.clone();
        superclass.i = 14;
        System.out.println(clone.i);
        System.out.println(superclass.i);

        clone.i = 15;
        System.out.println(clone.i);
        System.out.println(superclass.i);

        System.out.println(superclass.toString());
        System.out.println(clone.toString());

        System.out.println(sc.getClass().getSuperclass());
    }
}
