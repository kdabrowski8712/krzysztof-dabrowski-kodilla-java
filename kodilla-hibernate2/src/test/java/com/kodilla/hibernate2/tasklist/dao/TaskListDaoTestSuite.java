package com.kodilla.hibernate2.tasklist.dao;


import com.kodilla.hibernate2.task.Task;
import com.kodilla.hibernate2.task.TaskFinancialDetails;
import com.kodilla.hibernate2.task.dao.TaskDao;
import com.kodilla.hibernate2.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("Late tasks","List with task late");
        taskListDao.save(taskList);

        int id = taskList.getId();
        String targetName = taskListDao.findOne(id).getListName();

        //When
        List<TaskList> taskLists = taskListDao.findByListName(targetName);

        //Then

        Assert.assertEquals(1, taskLists.size());
        Assert.assertEquals("Late tasks",targetName);

        //CleanUp
        taskListDao.delete(id);

    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("To Do", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //taskListDao.delete(id);
    }
}
