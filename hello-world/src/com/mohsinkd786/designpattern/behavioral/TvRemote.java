package com.mohsinkd786.designpattern.behavioral;

public class TvRemote {
    public static void main(String[] args) {

        StateContext context = new StateContext();
        State startTv = new OnState();
        State stopTv = new OffState();

        // turn on the tv
        context.setState(startTv);
        context.doAction();
        // turn off the tv
        context.setState(stopTv);
        context.doAction();
    }
}
