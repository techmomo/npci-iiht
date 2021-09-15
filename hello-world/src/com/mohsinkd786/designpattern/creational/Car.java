package com.mohsinkd786.designpattern.creational;

public class Car extends Vehicle {

    public Car(int rpm){
        this.rpm = rpm;
    }
    int rpm;

    @Override
    int getRpm() {
        return rpm;
    }

    @Override
    String getTyreInfo() {
        return "It has 4 types";
    }
}
