package com.kodilla.good.patterns.food2door;

public class MainNotification implements CustomerNotification {
    @Override
    public void inform(OrderResult newOrderResult) {
        System.out.println("Sending mail to " + newOrderResult.getRequestedOrder().getOrderOwner().getName() + " "
                + newOrderResult.getRequestedOrder().getOrderOwner().getSurname() );
        System.out.println("Order status: " + newOrderResult.isFinishedSuccesfully());
    }
}
