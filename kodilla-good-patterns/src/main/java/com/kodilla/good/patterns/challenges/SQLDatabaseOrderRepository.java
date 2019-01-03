package com.kodilla.good.patterns.challenges;

public class SQLDatabaseOrderRepository implements OrderRepository {
    @Override
    public void storeOrder(Order orderToRecord) {
        System.out.println("Saving order into Microsoft SQL DB" );
    }
}
