package com.mohsinkd786.designpattern.behavioral;

public interface ShoppingCartVisitor {
    double visit(Book book);
    double visit(Electronic electronic);
}
