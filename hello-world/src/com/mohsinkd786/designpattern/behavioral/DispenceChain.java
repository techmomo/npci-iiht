package com.mohsinkd786.designpattern.behavioral;

public interface DispenceChain {

    void setNextChain(DispenceChain chain);
    void dispense(Currency currency);
}
