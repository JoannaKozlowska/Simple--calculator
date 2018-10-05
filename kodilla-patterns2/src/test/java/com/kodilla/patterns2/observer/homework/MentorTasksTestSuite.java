package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTasksTestSuite {
    @Test
    public void testUpdate(){
        //Given
        Task task1 = new Task1();
        Task task2 = new Task2();
        Task task3 = new Task3();
        Mentor janZaleski = new Mentor("Jan Zaleski");
        Mentor januszOwoc = new Mentor("Janusz Owoc");
        task1.registerObserver2(janZaleski);
        task1.registerObserver2(januszOwoc);
        task2.registerObserver2(janZaleski);
        task3.registerObserver2(januszOwoc);
        task2.registerObserver2(januszOwoc);
        //When
        task1.addExercise("part1");
        task2.addExercise("part1");
        task3.addExercise("part1");
        task1.addExercise("part2");
        task2.addExercise("part2");

        //Then
        assertEquals(4, janZaleski.getUpdateCount());
        assertEquals(5, januszOwoc.getUpdateCount());
        assertEquals("Jan Zaleski", janZaleski.getMentorName());
        assertEquals(2, task1.getExercises().size());
        assertEquals(1, task3.getExercises().size());
    }
}
