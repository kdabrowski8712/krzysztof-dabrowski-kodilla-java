package com.kodilla.spring.portfolio;

public class Board {
    private TaskList inProgressList;
    private TaskList toDoList;
    private TaskList doneList;

    public Board(TaskList inProgressList, TaskList toDoList, TaskList doneList) {
        this.inProgressList = inProgressList;
        this.toDoList = toDoList;
        this.doneList = doneList;
    }

    public void addTask(String task, TaskType taskType) {

        switch (taskType){
            case INPROGRESS: {
                inProgressList.addTask(task);
                break;
            }
            case TODO: {
                toDoList.addTask(task);
                break;
            }
            case DONE : {
                doneList.addTask(task);
                break;
            }
        }

    }

    public String getTask(int position , TaskType taskType) {

        switch (taskType){
            case INPROGRESS: {
                return inProgressList.getTask(position);
            }
            case TODO: {
                return toDoList.getTask(position);
            }
            case DONE : {
                return doneList.getTask(position);
            }
        }
        return null;
    }
}
