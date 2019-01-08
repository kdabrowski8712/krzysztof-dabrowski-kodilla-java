package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public abstract class Shop {

    private String name;
    private List<Product> productsInOffer;
    private int shopID;

    protected Product getProductByName(String productName) {

        for(Product p : productsInOffer) {
            if(p.getName().equals(productName)) {
                return p;
            }
        }
        return  null;
    }



    public abstract boolean process(String productName , double quantity);

    public Shop(String name, int shopID) {
        this.name = name;
        this.shopID = shopID;
        productsInOffer = new ArrayList<>();
    }

    public void addProductToOffer(Product newProductToAdd) {
        productsInOffer.add(newProductToAdd);
    }

    public int getShopID() {
        return shopID;
    }
}
