package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    private TaskList toDoList;

    @Autowired
    @Qualifier("inProgress")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("done")
    private TaskList doneList;


    @Bean
    public Board board() {

        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList listToDo() {
        return new TaskList();
    }
    @Bean (name = "inProgress")
    @Scope("prototype")
    public TaskList listInProgress() {
        return new TaskList();
    }
    @Bean (name = "done")
    @Scope("prototype")
    public TaskList listDone() {
        return new TaskList();
    }
}
