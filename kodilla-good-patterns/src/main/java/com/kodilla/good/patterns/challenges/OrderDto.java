package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private Order processedOrder;
    private boolean processingResultl;

    public OrderDto(Order processedOrder, boolean processingResultl) {
        this.processedOrder = processedOrder;
        this.processingResultl = processingResultl;
    }

    public Order getProcessedOrder() {
        return processedOrder;
    }

    public boolean isProcessingResultl() {
        return processingResultl;
    }
}
