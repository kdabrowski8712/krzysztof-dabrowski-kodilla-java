package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isExecuted;

    public ShoppingTask(String whatToBuy, double quantity) {
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.taskName = "Shopping Task";
    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return "Your have bought " + quantity + " of " + whatToBuy;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
