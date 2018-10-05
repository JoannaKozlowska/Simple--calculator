package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer2 {

    private final String mentorName;
    private int updateCount;

    @Override
    public void update(Task task) {
        System.out.println(mentorName + ": You have received a new task: " + task.getName() + "\n"
                + " (total: " + task.getExercises().size() + " exercises this topic to check ");
        updateCount++;
    }

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
