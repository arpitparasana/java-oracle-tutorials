package com.javademo.interfacedemo.inheritance.abstractdemo;

public abstract class Graphic implements Removable {
    int x, y;

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    abstract void draw();
    abstract void resize();
}
