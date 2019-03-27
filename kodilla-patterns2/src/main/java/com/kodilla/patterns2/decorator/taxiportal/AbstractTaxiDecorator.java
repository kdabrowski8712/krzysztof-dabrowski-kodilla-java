package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class AbstractTaxiDecorator implements TaxiOrder {

    private final TaxiOrder taxiOrder;

    protected AbstractTaxiDecorator(TaxiOrder order)
    {
        taxiOrder = order;
    }

    @Override
    public BigDecimal getCost() {
        return taxiOrder.getCost();
    }

    @Override
    public String getDescription() {
        return taxiOrder.getDescription();
    }
}
