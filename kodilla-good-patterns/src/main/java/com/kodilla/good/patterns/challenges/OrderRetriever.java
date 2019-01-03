package com.kodilla.good.patterns.challenges;

public class OrderRetriever {

    public  Order retrieve() {

        User newOrderUser = new User("testuser123","testsurname","t123",false);
        Product productOrder = new Product("potatoes",2.50,"kg");

        Order newOrder  = new Order(productOrder,newOrderUser,12);

        return  newOrder;
    }
}
