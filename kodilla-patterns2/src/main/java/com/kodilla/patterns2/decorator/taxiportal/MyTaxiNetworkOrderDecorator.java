package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class MyTaxiNetworkOrderDecorator extends AbstractTaxiDecorator {

    public MyTaxiNetworkOrderDecorator(TaxiOrder order) {
        super(order);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(30));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by MyTaxi Network";
    }
}
