package com.kodilla.good.patterns.food2door;

public class HealthyShop extends Shop {

    public HealthyShop() {
        super("HealthyShop", 2);
    }

    private boolean checkIfQuantityIsValid(double quantity) {
        return (quantity >= 5);
    }

    @Override
    public boolean process(String productName, double quantity) {

        // in this shop orders less than 5 are not accpted

        Product p = getProductByName(productName);

        if (checkIfQuantityIsValid(quantity) && p != null) {

            return p.updateAmountOnStock(quantity);
        } else {
            System.out.println("You have to order 5 or more piexes of an article");
            return false;
        }
    }

}


