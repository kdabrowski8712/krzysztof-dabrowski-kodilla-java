package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceRunner {
    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();

        Order newOrder = orderRetriever.retrieve();

        ProductOrderProcessor orderProcessor = new ProductOrderProcessor(new PostDelivery(),new ElectronicBankTransfer(),
                new ProductOrderService(),new MailInformationService(),new SQLDatabaseOrderRepository());

        orderProcessor.process(newOrder);

    }
}
