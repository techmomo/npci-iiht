package com.mohsinkd786.oops;

public abstract class Plant {

    // constant variable declaration
    // this cannot be modified
    public final int id = 100;

    public boolean eatable;

    public static boolean hasLeaves;

    // is used to initialise static variables
    static {
        hasLeaves = false;
        System.out.println("Hello static block..");
    }

    Plant(){
        System.out.println("Plant constructor...");
    }

    abstract boolean isEatable();

    static void process(){
        // static method can only access static attributes
        hasLeaves = false;
        System.out.println("Process Plant..");
    }

    // final methods cannot be overridden in child classes
    final boolean hasFlowers(){
        return false;
    }
}
