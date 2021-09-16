package com.mohsinkd786.designpattern.behavioral;

public class Book implements StockItem {

    private double price;
    private String isBnNumber;

    public Book(double price,String isBnNumber){
        this.price = price;
        this.isBnNumber = isBnNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getIsBnNumber() {
        return isBnNumber;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
