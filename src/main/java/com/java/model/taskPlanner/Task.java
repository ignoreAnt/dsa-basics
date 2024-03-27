package com.java.model.taskPlanner;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task extends WorkItem implements TaskManageable {

    private Duration estimate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private User owner;
    private TaskType taskType;
    private TaskStatus taskStatus;

    public Task(String id, String name, String description, TaskType taskType) {
        this.taskType = taskType;
        this.id = id;
        this.name= name;
        this.description = description;
    }

    @Override
    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public void ownTask() {

    }

    @Override
    public void transferTask(User user) {
        this.owner = user;
    }

    @Override
    public void assignTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    @Override
    public String toString() {
        return "Task{" +
                "owner=" + owner +
                ", taskType=" + taskType +
                ", taskStatus=" + taskStatus +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Task task) {
//        String idName = this.id + this.name;
//        return idName.compareTo(task.id + task.name);
//    }
}
