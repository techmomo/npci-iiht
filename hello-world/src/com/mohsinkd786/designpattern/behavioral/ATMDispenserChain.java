package com.mohsinkd786.designpattern.behavioral;

public class ATMDispenserChain {
    private DispenceChain chain;

    public DispenceChain getChain() {
        return chain;
    }

    public ATMDispenserChain(){
        this.chain= new Dispense500();
        DispenceChain chain100 = new Dispense100();
        chain.setNextChain(chain100);
    }
}
