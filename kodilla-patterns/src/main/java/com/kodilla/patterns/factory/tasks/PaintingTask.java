package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String color, String whatToPaint) {
        this.color = color;
        this.whatToPaint = whatToPaint;
        taskName = "Painting Task";
    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return "You have painted " + whatToPaint + " in " + color + " color";

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
