package com.mohsinkd786.designpattern.creational;

public class VehicleAbsFactory {

    public static Vehicle getVehicle(VehicleAbstractFactory abstractFactory,int rpm){
        return abstractFactory.createVehicle(rpm);
    }
}
