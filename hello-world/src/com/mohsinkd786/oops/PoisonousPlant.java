package com.mohsinkd786.oops;

public class PoisonousPlant extends Plant {
    @Override
    boolean isEatable() {
        eatable = false;
        return false;
    }
}
