package com.mohsinkd786.oops;

public class EatablePlant extends Plant {


    @Override
    boolean isEatable() {
        eatable = true;
        // access static variables & methods via inheritance
        hasLeaves = false;
        process();

        return eatable;
    }

    // not permitted
//    @Override
//    boolean hasFlowers() {
//        return false;
//    }
}
