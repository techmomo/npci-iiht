package com.mohsinkd786.designpattern.behavioral;

public abstract class House {

    public final void buildHouse(){
        buildFoundation();
        buidPillars();
        buildWalls();
        buildWindows();
    }


    private void buildFoundation(){
        System.out.println("build foundation");
    }

    // default implementations
    private void buildWindows(){
        System.out.println("build windows");
    }

    // need to be implemented in sub classes
    abstract void buidPillars();
    abstract void buildWalls();

}
