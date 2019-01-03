package com.kodilla.good.patterns.challenges;

public interface PaymentMethod {
    boolean processPayment(User orderOwner , double amountToPay);
}
