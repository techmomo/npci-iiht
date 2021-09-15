package com.mohsinkd786.designpattern.structural;

public class Square implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Square "+fillColor);
    }
}
