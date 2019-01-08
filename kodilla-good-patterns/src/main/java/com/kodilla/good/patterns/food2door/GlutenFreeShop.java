package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop extends Shop {
    public GlutenFreeShop() {
        super("GlutenFreeShop", 3);
    }

    @Override
    public boolean process(String productName, double quantity) {

        // in this shop you can take max 10 pcs of an article

        Product p = getProductByName(productName);

        if (quantity<=10 && p != null) {

            return p.updateAmountOnStock(quantity);
        } else {
            System.out.println("You can order max 10 pieces of an article");
            return false;
        }
    }
}
