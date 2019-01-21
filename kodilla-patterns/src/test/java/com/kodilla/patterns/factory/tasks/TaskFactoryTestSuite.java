package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testCreateDrivingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.generateTask(TaskType.DRIVING);

        //Then
        Assert.assertEquals("Driving Task",drivingTask.getTaskName());
        Assert.assertEquals("You are driving to Poznan using bus",drivingTask.executeTask());
        Assert.assertTrue(drivingTask.isTaskExecuted());

    }

    @Test
    public void testCreateShoppingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppinggTask = taskFactory.generateTask(TaskType.SHOPPING);

        //Then
        Assert.assertEquals("Shopping Task",shoppinggTask.getTaskName());
        Assert.assertEquals("Your have bought 12.0 of potatoes",shoppinggTask.executeTask());
        Assert.assertTrue(shoppinggTask.isTaskExecuted());
    }

    @Test

    public void testCreatePaintingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.generateTask(TaskType.PAINTING);

        //Then
        Assert.assertEquals("Painting Task",paintingTask.getTaskName());
        Assert.assertEquals("You have painted house in red color",paintingTask.executeTask());
        Assert.assertTrue(paintingTask.isTaskExecuted());

    }

}
