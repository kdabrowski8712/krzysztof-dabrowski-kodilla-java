package com.kodilla.good.patterns.challenges;

public class Product {
    private String name;
    private double pricePerUnit;
    private String unit;

    public Product(String name,double  pricePerUnit, String unit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public String getUnit() {
        return unit;
    }
}
