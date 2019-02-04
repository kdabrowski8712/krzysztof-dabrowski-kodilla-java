package com.kodilla.hibernate2.tasklist.dao;


import com.kodilla.hibernate2.task.Task;
import com.kodilla.hibernate2.task.dao.TaskDao;
import com.kodilla.hibernate2.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("To Do","List with tasks to do");
        taskListDao.save(taskList);

        int id = taskList.getId();
        String targetName = taskListDao.findOne(id).getListName();

        //When
        List<TaskList> taskLists = taskListDao.findByListName(targetName);

        //Then
        Assert.assertEquals(1, taskLists.size());
        Assert.assertEquals("To Do",targetName);

        //CleanUp
        taskListDao.delete(id);

    }
}
