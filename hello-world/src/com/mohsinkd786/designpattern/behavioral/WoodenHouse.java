package com.mohsinkd786.designpattern.behavioral;

public class WoodenHouse extends House{

    @Override
    void buidPillars() {
        System.out.println("Wooden : Pillars");
    }

    @Override
    void buildWalls() {
        System.out.println("Wooden : Walls");
    }
}
