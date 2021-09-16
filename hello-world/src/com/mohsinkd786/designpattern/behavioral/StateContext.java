package com.mohsinkd786.designpattern.behavioral;

public class StateContext implements State {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
