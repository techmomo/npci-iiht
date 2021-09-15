package com.mohsinkd786.designpattern.structural;

public abstract class MyShape {
    protected Color color;

    public MyShape(Color color){
        this.color = color;
    }
    abstract void apply();
}
