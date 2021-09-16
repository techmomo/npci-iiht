package com.mohsinkd786.designpattern.behavioral;

public class Electronic implements StockItem {

    private double cost;
    private String category;
    private String sku;

    public Electronic(double cost,String category,String sku){
        this.category = category;
        this.cost = cost;
        this.sku = sku;
    }

    public double getCost() {
        return cost;
    }

    public String getCategory() {
        return category;
    }

    public String getSku() {
        return sku;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
