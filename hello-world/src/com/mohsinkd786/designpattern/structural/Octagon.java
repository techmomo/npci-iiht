package com.mohsinkd786.designpattern.structural;

public class Octagon extends MyShape {
    public Octagon(Color c){
        super(c);
    }
    @Override
    void apply() {
        color.apply();
    }
}
