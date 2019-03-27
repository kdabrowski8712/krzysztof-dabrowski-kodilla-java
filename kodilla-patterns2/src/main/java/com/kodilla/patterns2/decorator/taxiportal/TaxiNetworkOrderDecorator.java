package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class TaxiNetworkOrderDecorator extends AbstractTaxiDecorator {

    public TaxiNetworkOrderDecorator(TaxiOrder order) {
        super(order);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(35));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Taxi Network";
    }
}
