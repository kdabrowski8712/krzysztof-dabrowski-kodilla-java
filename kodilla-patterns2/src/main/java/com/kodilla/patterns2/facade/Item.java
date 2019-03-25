package com.kodilla.patterns2.facade;

public class Item {

    private final Long producrId;
    private final double qty;

    public Item(Long producrId, double qty) {
        this.producrId = producrId;
        this.qty = qty;
    }

    public Long getProducrId() {
        return producrId;
    }

    public double getQty() {
        return qty;
    }
}
