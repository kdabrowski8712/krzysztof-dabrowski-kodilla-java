package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {
    private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }


    @Override
    public void update(TaskList taskList) {
        System.out.println("Mentor: " + name  + "new task in list of user " +
                taskList.getUserName() + "Size: " + taskList.getTasks().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
