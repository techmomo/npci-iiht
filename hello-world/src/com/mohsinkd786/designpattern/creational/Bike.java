package com.mohsinkd786.designpattern.creational;

public class Bike extends Vehicle {

    int rpm;
    public Bike(int rpm){
        this.rpm = rpm;
    }
    @Override
    String getTyreInfo() {
        return "It has 2 tyres";
    }

    @Override
    int getRpm() {
        return rpm;
    }
}
