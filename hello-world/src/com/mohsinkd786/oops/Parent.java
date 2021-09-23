package com.mohsinkd786.oops;

// cannot be implemented
public final class Parent {

    // immutable class
    private final int id;

    public Parent(int i){
        id = i;
    }

    public int getId(){
        return id;
    }
}
