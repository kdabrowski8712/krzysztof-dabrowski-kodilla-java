package com.kodilla.good.patterns.food2door;

public class OrderGenerator {
    public Order retrieve() {


        User orderOwner = new User("jkowalski","Jan","Kowalski");

        Order retrievedOrder = new Order(orderOwner,1,"BioPotatoes",12);
        return  retrievedOrder;
    }
}
