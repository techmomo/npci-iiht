package com.mohsinkd786.basics;

import java.util.Collections;
import java.util.List;

public class Addition implements Operation,OperationType,Operation1 {

    @Override
    public void execute(int i, int j) {
        System.out.println("Sample");
    }

    @Override
    public void tryMe() {
        //
        Operation.super.tryMe(); // make a call to default try me in Operation Interface
        Operation1.super.tryMe(); // make a call to default try me in Operation1 Interface

        System.out.println("Hello");
    }

    @Override
    public boolean isValidOperation() {
        return true;
    }
}
