package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private  String using;
    private  boolean isExecuted;

    public DrivingTask(String where, String using) {
        this.where = where;
        this.using = using;
        taskName = "Driving Task";
    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return "You are driving to " + where + " using " + using ;
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
