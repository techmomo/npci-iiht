package com.mohsinkd786.designpattern.creational;

public class BikeFactory implements VehicleAbstractFactory {
    @Override
    public Vehicle createVehicle(int rpm) {
        return new Bike(rpm);
    }
}
