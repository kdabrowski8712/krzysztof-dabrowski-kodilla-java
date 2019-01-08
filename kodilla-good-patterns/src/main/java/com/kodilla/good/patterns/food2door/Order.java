package com.kodilla.good.patterns.food2door;

public class Order {
    private User orderOwner;
    private int shopID;
    private String productName;
    private double orderedQuantity;

    public Order(User orderOwner, int shopID, String productName, double orderedQuantity) {
        this.orderOwner = orderOwner;
        this.shopID = shopID;
        this.productName = productName;
        this.orderedQuantity = orderedQuantity;
    }

    public User getOrderOwner() {
        return orderOwner;
    }

    public int getShopID() {
        return shopID;
    }

    public String getProductName() {
        return productName;
    }

    public double getOrderedQuantity() {
        return orderedQuantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderOwner=" + orderOwner +
                ", shopID=" + shopID +
                ", productName='" + productName + '\'' +
                ", orderedQuantity=" + orderedQuantity +
                '}';
    }
}
