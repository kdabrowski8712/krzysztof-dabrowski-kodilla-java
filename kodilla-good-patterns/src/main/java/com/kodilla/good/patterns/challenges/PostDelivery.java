package com.kodilla.good.patterns.challenges;

public class PostDelivery implements DeliveryMethod {
    private String postOfficeLocation;
    private String areaZipCode;

    @Override
    public double getDeliveryPrice() {
        return 12.30;
    }
}
