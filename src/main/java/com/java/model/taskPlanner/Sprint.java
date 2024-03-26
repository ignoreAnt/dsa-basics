package com.java.model.taskPlanner;

import java.time.LocalDateTime;

public class Sprint extends WorkItem implements SprintManageable{
//    private String sprintId;
//    private String SprintName;
//    private String description;
    private String duration;

    @Override
    public void getCompletionPercentage() {
        System.out.println("Sprint completed : 50% ");
    }

    @Override
    public void changeDuration() {

    }

    @Override
    public void addTasks() {

    }

    @Override
    public void removeTask() {

    }

    @Override
    public void OrderTasks() {

    }

    @Override
    public void filterTasks() {

    }
}
