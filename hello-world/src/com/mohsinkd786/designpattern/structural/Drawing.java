package com.mohsinkd786.designpattern.structural;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    public List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for(Shape s : shapes){
            s.draw(fillColor);
        }
    }

    public void add(Shape s){
        shapes.add(s);
    }

    public void remove(Shape s){
        shapes.remove(s);
    }
}
