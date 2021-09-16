package com.mohsinkd786.designpattern.behavioral;

public class VisitorClient {
    public static void main(String[] args) {
        StockItem[] items = new StockItem[] {
                new Book(100,"123"),
                new Book(99,"234"),
                new Electronic(1200,"TV","888")};

        double totalAmount = calculatePrice(items);
        System.out.println("Total Cost "+totalAmount);
    }
    private static double calculatePrice(StockItem[] items){
        ShoppingCartVisitor cartVisitor = new AmazonShoppingCartVisitor();
        double sum = 0;
        for (StockItem item: items) {
            sum = sum + item.accept(cartVisitor);
        }
        return sum;
    }
}
