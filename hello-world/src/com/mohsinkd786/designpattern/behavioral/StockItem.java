package com.mohsinkd786.designpattern.behavioral;

public interface StockItem {
    double accept(ShoppingCartVisitor visitor);
}
