package com.mohsinkd786.designpattern.behavioral;

public class OffState implements State {
    @Override
    public void doAction() {
        System.out.println("Off State");
    }
}
