package com.mohsinkd786.designpattern.behavioral;

public class Dispense100 implements DispenceChain {
    private DispenceChain chain;

    @Override
    public void setNextChain(DispenceChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 100){
            int num = currency.getAmount() / 100;
            int remainder = currency.getAmount() % 100;
            System.out.println("Dispensing "+num + "of INR 100 notes");
            if (remainder != 0) {
                    this.chain.dispense(new Currency(remainder));
                }
            }else{
                this.chain.dispense(currency);
        }
    }
}
