package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "driving";
    public static final String SHOPPING = "shopping";
    public static final String PAINTING = "painting";

    public static Task createTask(String typeOfTask) {
        switch (typeOfTask) {
            case DRIVING:
                return new DrivingTask("travel home", "Warsaw", "train");
            case SHOPPING:
                return new ShoppingTask("buy", "apple", 10.5);
            case PAINTING:
                return new PaintingTask("paint", "white", "wall");
            default:
                return null;
        }
    }
}
