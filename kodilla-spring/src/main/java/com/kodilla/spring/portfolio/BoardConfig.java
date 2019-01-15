package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("inprog")
    TaskList inProgressTasks;

    @Autowired
    @Qualifier("todo")
    TaskList toDoTasks;

    @Autowired
    @Qualifier("done")
    TaskList doneTasks;

    @Bean
    public Board getTaskBoard() {
        return new Board(inProgressTasks,toDoTasks,doneTasks);
    }

    @Bean(name = "inprog")
    @Scope("prototype")
    public TaskList getInProgressTaskList() {
        return new TaskList();
    }

    @Bean(name = "todo")
    @Scope("prototype")

    public TaskList getToDoTaskList() {
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")

    public TaskList getDoneTaskList() {
        return new TaskList();
    }

}
