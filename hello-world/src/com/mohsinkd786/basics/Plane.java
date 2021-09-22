package com.mohsinkd786.basics;

public abstract class Plane {

    int planeId;

    Plane(int id){
        planeId = id;
    }

    // non abstract method
    void sayHello(){
        //
    }

    abstract int calculateWidth(int x,int y);
}

// object creation is not allowed / possible
// can have constructor though
//
