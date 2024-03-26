package com.java.model.taskPlanner;

import java.time.LocalDateTime;

public class Task extends WorkItem implements TaskManageable {
//    private String taskId;
//    private String taskName;
//    private String description;

    private String estimate;
    private LocalDateTime startTime;
    private  LocalDateTime endTime;
    private String owner;

    @Override
    public void getCompletionPercentage() {
        System.out.println("Task completed : 80%");
    }

    @Override
    public void ownTask() {

    }

    @Override
    public void transferTask() {

    }

    @Override
    public void estimateTask() {

    }

    @Override
    public void assignTaskType() {

    }
}
