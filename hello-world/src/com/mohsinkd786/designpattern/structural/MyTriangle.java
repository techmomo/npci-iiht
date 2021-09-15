package com.mohsinkd786.designpattern.structural;

public class MyTriangle extends MyShape{

    public MyTriangle(Color c){
        super(c);
    }
    @Override
    void apply() {
        color.apply();
    }
}
