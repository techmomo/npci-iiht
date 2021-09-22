package com.mohsinkd786.basics;

public class Boeing extends Plane {

    Boeing(int id){
        // call parent class constructor
        super(id);
        // super to access parent class attributes
        // this to access parent class attributes
    }
    @Override
    int calculateWidth(int x, int y) {
        return x + y;
    }
}
