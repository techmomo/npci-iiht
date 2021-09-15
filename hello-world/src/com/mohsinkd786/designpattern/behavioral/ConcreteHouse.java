package com.mohsinkd786.designpattern.behavioral;

public class ConcreteHouse extends House {
    @Override
    void buildWalls() {
        System.out.println("Concrete : Walls");
    }

    @Override
    void buidPillars() {
        System.out.println("Concrete : Pillars");
    }
}
