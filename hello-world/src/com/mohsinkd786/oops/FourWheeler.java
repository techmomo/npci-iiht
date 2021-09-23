package com.mohsinkd786.oops;

public class FourWheeler implements Automobile {
    @Override
    public void engine() {

    }

    @Override
    public void process() {
        // call static methods in interface
        Automobile.messageMe();
        //Automobile.id
    }
}
