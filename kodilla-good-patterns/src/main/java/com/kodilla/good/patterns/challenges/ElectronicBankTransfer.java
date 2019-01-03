package com.kodilla.good.patterns.challenges;

public class ElectronicBankTransfer implements PaymentMethod {

    private int bankID;
    private String bankLoginUrl;

    private boolean logAndAuthenricateUser() {

        System.out.println("User logged in and was authentocated");
        return true;
    }


    @Override
    public boolean processPayment(User orderOwner, double amountToPay) {

        if(logAndAuthenricateUser()) {
            System.out.println("User " + orderOwner.getName() + "is able to pay " + amountToPay);
            System.out.println("Processing via bank site");
            return true;
        }


        return false;
    }
}
