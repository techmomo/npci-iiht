package com.mohsinkd786.designpattern.structural;

public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Triangle "+fillColor);
    }
}
