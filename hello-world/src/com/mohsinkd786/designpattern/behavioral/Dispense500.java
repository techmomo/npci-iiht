package com.mohsinkd786.designpattern.behavioral;

public class Dispense500 implements DispenceChain {

    private DispenceChain chain;

    @Override
    public void setNextChain(DispenceChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 500){
            int num = currency.getAmount() / 500;
            int remainder = currency.getAmount() % 500;
            System.out.println("Dispensing "+num + "of INR 500 notes");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        }else{
            this.chain.dispense(currency);
        }
    }
}
