package com.mohsinkd786.oops;

public interface Automobile {

    //int id = 10;

    // all variables are constants by nature in case of interfaces
    int id = 110;

    void engine();

    default void process(){

    }
    static void messageMe(){
        System.out.println("Auto Message me.. ");
    }
}
