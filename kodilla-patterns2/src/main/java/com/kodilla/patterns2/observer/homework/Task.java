package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Task implements Observable2 {
    private final List<Observer2> mentors;
    private final List<String> exercises;
    private final String name;

    public Task(String name) {
        mentors = new ArrayList<>();
        exercises = new ArrayList<>();
        this.name = name;
    }
    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyObservers2();
    }

    @Override
    public void registerObserver2(Observer2 observer2) {
        mentors.add(observer2);
    }

    @Override
    public void notifyObservers2() {
        for (Observer2 observer : mentors) {
            observer.update(this);
        }
    }
    @Override
    public void removeObserver2(Observer2 observer2) {
        mentors.remove(observer2);
    }

    public List<String> getExercises() {
        return exercises;
    }

    public String getName() {
        return name;
    }

}
