package com.mohsinkd786.basics;

public class Bombardier extends Plane {

    Bombardier(int id){
        super(id);
    }

    @Override
    int calculateWidth(int x, int y) {
        // parent class method flows automatically
        sayHello();
        return x * y;
    }
}
