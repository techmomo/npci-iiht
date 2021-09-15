package com.mohsinkd786.designpattern.creational;

public class Singleton {

    // Eager Initialization
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
    private Singleton(){

    }
}
