package com.kodilla.good.patterns.challenges;

public class Order {

    private Product orderedItem;
    private User orderOwner;
    private double quantity;

    public Order(Product orderedItem, User orderOwner, int quantity) {
        this.orderedItem = orderedItem;
        this.orderOwner = orderOwner;
        this.quantity = quantity;
    }

    public Product getOrderedItem() {
        return orderedItem;
    }

    public User getOrderOwner() {
        return orderOwner;
    }

    public double getQuantity() {
        return quantity;
    }

    public double calculateAmountOfMoneyToPay(DeliveryMethod deliveryMethod) {
        return (orderedItem.getPricePerUnit() * quantity) + deliveryMethod.getDeliveryPrice();
    }
}
