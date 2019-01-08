package com.kodilla.good.patterns.food2door;

public class Food2DoorMain {
    public static void main(String[] args) {
        Food2DoorSuppliers suppliers = new Food2DoorSuppliers();
        Food2DoorPreparator.prepareSuppliers(suppliers);

        OrderGenerator orderGenerator = new OrderGenerator();
        OrderProcessor orderProcessor = new OrderProcessor(suppliers,new MainNotification());

        OrderResult result = orderProcessor.processOrder(orderGenerator.retrieve());

        System.out.println(result.getRequestedOrder());
        System.out.println(result.isFinishedSuccesfully());


    }
}
