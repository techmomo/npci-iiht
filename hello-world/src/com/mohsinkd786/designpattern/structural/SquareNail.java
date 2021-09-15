package com.mohsinkd786.designpattern.structural;

public class SquareNail {
    private double width;

    public SquareNail(double width){
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare(){
        return Math.pow(this.width,2);
    }
}
