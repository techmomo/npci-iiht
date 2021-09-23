package com.mohsinkd786.basics;

class Oops {

    public static void main(String[] args) {

        // Objects
        // Classes

        // Inheritance - class / interface
        // Polymorphism
        // Abstraction
        // Encapsulation
        // Association

        // member variables
        // methods
        // classes

        // reference variable
        Sample obj;

        //obj = new Sample();

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

        // not permitted
        // Plane plane = new Plane();
//        Boeing boeing = new Boeing();
//        Bombardier bombardier = new Bombardier();

        // create child object using parent
        Plane plane = new Boeing(1);
        Plane plane1 = new Bombardier(7);


        PlaneService planeService = new PlaneService();

        planeService.getPlaneInfo(plane1,10,2);

        System.out.println("P Id "+plane1.planeId);

    }
}


// Assignment : Write a Program to print fibonnaci series splitted across 2 methods - alternatively
// 1 1 2 3 5 8 13....

// Assignment: Write a Program to show the heirloom + personal assets for 3 generations ,note every generation will add some of its own.

// Assignment : Identify the features of a vehicle via multi level inheritance , e.g. if I give Maruti I should get the specs for it,& say its a car ,
//              if I give harley it should give me the specs for it & inform that harley is a bike

// Assignment 3 : Write a Program to calculate the cost of spares used to make cars (e.g. 1 bentley , 2 polo, 1 trailer )
//              e.g. wheels = 5 + 5 + 12 & glasses, doors


/*
* Types of classes in Java:
* 1. Simple Class
* 2. Inner class
* 3. Static Inner class
* 4. Method Local class
* 5. Abstract class
*
*
* */
/*
* multi level inheritance
*
* Class A {
*
* }
*
* Class B extends A{
*   void add(){
*   }
* }
*
* class C extends B{
*   // i.e. inherited from A & B
*   void sub(){
*
*   }
* }
*
* A aa = new C();
* B bb = new C();
* C cc = new C();
*
* aa.add(); // will throw an error
* bb.add();
* cc.add();
*
* cc.sub();
*
* */
