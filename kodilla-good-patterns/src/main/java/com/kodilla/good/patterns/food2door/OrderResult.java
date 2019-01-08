package com.kodilla.good.patterns.food2door;

public class OrderResult {
    private Order requestedOrder;
    private boolean finishedSuccesfully;

    public Order getRequestedOrder() {
        return requestedOrder;
    }

    public boolean isFinishedSuccesfully() {
        return finishedSuccesfully;
    }



    public void setRequestedOrder(Order requestedOrder) {
        this.requestedOrder = requestedOrder;
    }

    public void setFinishedSuccesfully(boolean finishedSuccesfully) {
        this.finishedSuccesfully = finishedSuccesfully;
    }


}
