package com.javademo.generics;

/*
 * #1 Generics
 */
public class Box<T> {
    
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
