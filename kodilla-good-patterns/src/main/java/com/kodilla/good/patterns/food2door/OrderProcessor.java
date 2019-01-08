package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    private Food2DoorSuppliers suppliers;
    private CustomerNotification notification;

    public  OrderProcessor(Food2DoorSuppliers suppliers, CustomerNotification notificationMethod) {
        this.suppliers = suppliers;
        this.notification = notificationMethod;
    }

    public OrderResult processOrder(Order newOrder) {

        Shop s = suppliers.getSupplierById(newOrder.getShopID());
        OrderResult result = new OrderResult();
        result.setRequestedOrder(newOrder);

        if(s!=null) {

            boolean shopOrderResult = s.process(newOrder.getProductName(),newOrder.getOrderedQuantity());
            result.setFinishedSuccesfully(shopOrderResult);
        }
        else {
            result.setFinishedSuccesfully(false);
        }

        notification.inform(result);

        return result;
    }
}
