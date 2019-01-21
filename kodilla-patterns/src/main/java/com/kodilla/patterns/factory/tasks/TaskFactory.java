package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public Task generateTask(TaskType taskType) {

        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("potatoes", 12);

            case DRIVING:
                return new DrivingTask("Poznan","bus");

            case PAINTING:
                return new PaintingTask("red","house");

            default:
                return null;

        }
    }

}
