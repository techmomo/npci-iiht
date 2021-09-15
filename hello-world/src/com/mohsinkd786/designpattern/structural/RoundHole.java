package com.mohsinkd786.designpattern.structural;

public class RoundHole {
    private double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundNail nail){
        return (this.getRadius() >= nail.getRadius());
    }
}
