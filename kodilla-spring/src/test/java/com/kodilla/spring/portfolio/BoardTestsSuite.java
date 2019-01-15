package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestsSuite {

    @Test
    public void testAddInProgressTask() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Board taskBoard = (Board) context.getBean("getTaskBoard");

        String inProgTask1 = "IN PROG TASK 1";

        //When
        taskBoard.addTask(inProgTask1,TaskType.INPROGRESS);

        //Then
        Assert.assertEquals("IN PROG TASK 1",taskBoard.getTask(0,TaskType.INPROGRESS));

    }

    @Test
    public void testAddToDoTask() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Board taskBoard = (Board) context.getBean("getTaskBoard");

        String toDoTask1 = "TODO TASK 1";

        //When
        taskBoard.addTask(toDoTask1,TaskType.TODO);

        //Then
        Assert.assertEquals("TODO TASK 1",taskBoard.getTask(0,TaskType.TODO));

    }

    @Test
    public void testAddDoneTask() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Board taskBoard = (Board) context.getBean("getTaskBoard");

        String doneTask1 = "DONE TASK 1";

        //When
        taskBoard.addTask(doneTask1,TaskType.DONE);

        //Then
        Assert.assertEquals("DONE TASK 1",taskBoard.getTask(0,TaskType.DONE));

    }

    @Test
    public void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}
