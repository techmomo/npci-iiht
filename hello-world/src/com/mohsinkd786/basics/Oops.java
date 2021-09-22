package com.mohsinkd786.basics;

public class Oops {

    public static void main(String[] args) {

        // Objects
        // Classes

        // member variables
        // methods
        // classes

        // reference variable
        Sample obj;

        // create the object for sample
        // default no argument constructor
        obj = new Sample(6);
        //obj.i = 15;

        obj.callMe();
        //obj.callMe();

        // call a method

        int j = obj.i;

        Sample obj1 = new Sample(12);
        //obj1.i = 5;

        // jvm memory model

        // obj[i= 15] , obj1[i=5]

        // class

        // memory allocation happens only for objects


        // JVM -

        // Method Area |
        // Stack |  - Call Stack
        // Heap -
            // Young Generation
            // Eden Space
            // Survivor Series - 1
            // Survivor Series - 2
            // Meta Space / Perm Gen
    }
}


// Assignment : Write a Program to print fibonnaci series splitted across 2 methods - alternatively
// 1 1 2 3 5 8 13....
