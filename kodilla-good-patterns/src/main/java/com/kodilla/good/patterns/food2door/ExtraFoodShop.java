package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop extends Shop {

    private boolean checkIf2PacksAreOredred(double quantity) {

        if(quantity % 2 ==0)
            return true;
        else
            return false;
    }

    public ExtraFoodShop() {
        super("ExtraFoodShop", 1);
    }

    @Override
    public boolean process(String productName, double quantity) {

        // products can by ordered only in 2 packs
        Product p = getProductByName(productName);

        if(checkIf2PacksAreOredred(quantity) && p!=null ) {

            return p.updateAmountOnStock(quantity);
        }
        else {
            System.out.println("YOu have to buy in 2 - packs");
            return false;
        }

    }
}
