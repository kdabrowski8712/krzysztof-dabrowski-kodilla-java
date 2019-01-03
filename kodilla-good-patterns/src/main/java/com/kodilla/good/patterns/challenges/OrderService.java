package com.kodilla.good.patterns.challenges;

public interface OrderService {
    boolean order(User orderOwner, Product product, double quantity);
}
