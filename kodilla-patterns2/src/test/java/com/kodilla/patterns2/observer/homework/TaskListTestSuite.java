package com.kodilla.patterns2.observer.homework;

import javafx.concurrent.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Mentor m1 = new Mentor("Jan Kowalski");
        Mentor zbyszekZak = new Mentor("Zbyszek Zak");

        TaskList adamTaskList = new TaskList("Adam");
        TaskList janekTaskList = new TaskList("Janek");
        TaskList zosiaTaskListt = new TaskList("Zosia");

        adamTaskList.registerObserver(m1);
        janekTaskList.registerObserver(m1);
        zosiaTaskListt.registerObserver(zbyszekZak);

        //When
        adamTaskList.addTask("taskk1");
        janekTaskList.addTask("task2");
        zosiaTaskListt.addTask("task30");


        //Then
        Assert.assertEquals(2,m1.getUpdateCount());
        Assert.assertEquals(1,zbyszekZak.getUpdateCount());
    }
}
