package com.mohsinkd786.designpattern.behavioral;

public class AmazonShoppingCartVisitor implements ShoppingCartVisitor {

    @Override
    public double visit(Book book) {
        double cost;
        // apply some discount
        if(book.getPrice() > 1000){
            // give 100 rupees discount
            cost = book.getPrice() - 100;
        }else {
            cost = book.getPrice();
        }
        return cost;
    }

    @Override
    public double visit(Electronic electronic) {
        double cost;
        if("TV".equalsIgnoreCase(electronic.getCategory())){
            // add GST
            cost = electronic.getCost() + (electronic.getCost()* 13/100);
        }else {
            cost = electronic.getCost();
        }
        return cost;
    }
}
