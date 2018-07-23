package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    public void testTaskAdd(){

        //When

        String task1 = "Write an e-mail to a new customer";
        String task2 = "Send the ordered goods";
        String task3 = "Order office supplies";
        String task4 = "Order new materials";

        board.getToDoList().getTasks().add(task1);
        board.getInProgressList().getTasks().add(task2);
        board.getDoneList().getTasks().add(task3);
        board.getDoneList().getTasks().add(task4);

        //Then
        Assert.assertEquals(2,board.getDoneList().getTasks().size());
        Assert.assertEquals(1,board.getToDoList().getTasks().size());
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
    }
}
