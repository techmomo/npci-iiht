package com.mohsinkd786.designpattern.structural;

public class Circle  implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Circle "+fillColor);
    }
}
