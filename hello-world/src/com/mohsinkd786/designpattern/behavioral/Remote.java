package com.mohsinkd786.designpattern.behavioral;

public class Remote {
    private String state="";

    public void setState(String state) {
        this.state = state;
    }
    public void doAction(){
        if(state.equalsIgnoreCase("ON")){
            System.out.println("Turned On");
        }else if(state.equalsIgnoreCase("OFF")){
            System.out.println("Turned Off");
        }
    }

    public static void main(String[] args) {
        Remote remote = new Remote();
        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();
    }
}
