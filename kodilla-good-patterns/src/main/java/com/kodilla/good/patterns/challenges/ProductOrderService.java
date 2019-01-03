package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(User orderOwner, Product product, double quantity) {

        if(!orderOwner.isBlockedInSystem()) {
            System.out.println("User " + orderOwner.getName() + " is ordering " + product.getName() );
            System.out.println("Quantity: " + quantity + " " + product.getUnit());
            return true;
        }

        System.out.println("User is blocked in system. Order not possible !!!!");
        return false;
    }
}
