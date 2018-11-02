package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

public class TaskListDaoTestSuite {

//    @Autowired
//    private TaskListDao taskListDao;
//
//    @Autowired
//    private TaskDao taskDao;

//    private static final String LISTNAME = "To do";
//    private static final String DESCRIPTION = "Learning hibernate";

//    @Test
//    public void testFindByListName() {
//        //Given
//        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
//        taskListDao.save(taskList);
//
//        //When
//        String listName = taskList.getListName();
//        List<TaskList> readTaskList = taskListDao.findByListName(listName);
//        //Then
//        Assert.assertEquals(1, readTaskList.size());
//        Assert.assertEquals("To do", readTaskList.get(0).getListName());
//        //CleanUp
//        int id = readTaskList.get(0).getId();
//        taskListDao.delete(id);
//    }
}
