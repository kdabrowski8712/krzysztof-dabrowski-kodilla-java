package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorSuppliers {
    private List<Shop> foodSuppliers;

    public Food2DoorSuppliers() {
        foodSuppliers = new ArrayList<>();
    }

    public void  addSupplier( Shop newSupplier) {
        foodSuppliers.add(newSupplier);
    }

    public void removeSupplier(Shop supplierToRemove) {
        foodSuppliers.remove(supplierToRemove);
    }

    public Shop getSupplierById(int ID) {

        for(Shop s : foodSuppliers) {
            if(s.getShopID() == ID){
                return  s;
            }
        }
        return null;
    }
}
