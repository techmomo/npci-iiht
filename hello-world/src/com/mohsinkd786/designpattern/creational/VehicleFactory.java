package com.mohsinkd786.designpattern.creational;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType,int rpm){
        if("CAR".equals(vehicleType)){
            return new Car(rpm);
        }else if("BIKE".equalsIgnoreCase(vehicleType)){
            return new Bike(rpm);
        }else{
            return null;
        }
    }
}
