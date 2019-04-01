package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observable;
import com.kodilla.patterns2.observer.forum.Observer;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements TaskObservable {

    private List<String> tasks;
    private List<TaskObserver> observers;
    private String userName;

    public TaskList(String username) {
        this.userName = username;
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(TaskObserver o : observers) {
            o.update(TaskList.this);
        }
    }


    @Override
    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getUserName() {
        return userName;
    }
}
