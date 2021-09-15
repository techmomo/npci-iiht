package com.mohsinkd786.designpattern.creational;

public class CarFactory implements VehicleAbstractFactory {
    @Override
    public Vehicle createVehicle(int rpm) {
        return new Car(rpm);
    }
}
