package com.kodilla.good.patterns.food2door;

public class Product {
    private String name;
    private String unit;
    private double amountOnStock;

    public Product(String name, String unit, double amountOnStock) {
        this.name = name;
        this.unit = unit;
        this.amountOnStock = amountOnStock;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public boolean updateAmountOnStock(double orderedQuantity) {

        if(amountOnStock-orderedQuantity>=0) {
            amountOnStock = amountOnStock - orderedQuantity;
            return true;
        }
        else {
            System.out.println("Quantity is too big. Shop don't have it on stack");
            return false;
        }



    }

}
