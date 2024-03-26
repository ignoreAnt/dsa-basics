package com.java.model.taskPlanner;

public class TaskPlannerMain {
    public static void main(String[] args) {
        Task task = new Task();
        task.getCompletionPercentage();

        Sprint sprint = new Sprint();
        sprint.getCompletionPercentage();
    }
}
