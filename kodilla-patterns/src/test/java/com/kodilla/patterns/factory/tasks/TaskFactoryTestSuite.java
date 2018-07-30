package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testCreateDrivingTask() {
        //When
        Task createdTask = TaskFactory.createTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("travel home", createdTask.getTaskName());
    }
    @Test
    public void testCreateShoppingTask() {
        //When
        Task createdTask = TaskFactory.createTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("buy", createdTask.getTaskName());
    }
    @Test
    public void testCreatePaintingTask() {
        //When
        Task createdTask = TaskFactory.createTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("paint", createdTask.getTaskName());
    }
}
