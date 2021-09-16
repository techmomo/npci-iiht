package com.mohsinkd786.designpattern.behavioral;

public class OnState implements State {
    @Override
    public void doAction() {
        System.out.println("On State");
    }
}
