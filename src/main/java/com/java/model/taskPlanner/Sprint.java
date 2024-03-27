package com.java.model.taskPlanner;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sprint extends WorkItem implements SprintManageable{
    //    private String sprintId;
    //    private String SprintName;
    //    private String description;

    private Duration duration;

    private final List<Task> tasks;

    public Sprint(String id, String name, String description, Duration duration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.tasks = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }
    public Duration getDuration() {
        return duration;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void getCompletionPercentage() {
        // Percentage : (number of completed tasks/total tasks) * 100
        double percentage = 0;
        if (!tasks.isEmpty()){
            percentage = (double) (numberOfCompletedTasks(tasks) * 100) /tasks.size();
        }
        System.out.println("Sprint completed : " +  percentage + "%");
    }

    @Override
    public void changeDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public void addAllTasks(List<Task> allTasks) {
        tasks.addAll(allTasks);
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public void sortTasks() {
//            Collections.sort(tasks);
    }

    @Override
    public void filterTasks() {

    }

    private int numberOfCompletedTasks(List<Task> taskList){
        int count = 0;
        for (Task task : taskList) {
            if (task.getTaskStatus() != null
                    && (task.getTaskStatus().equals(TaskStatus.COMPLETED)
                    || task.getTaskStatus().equals(TaskStatus.CLOSED))) {
                count++;
            }
        }

        // Time complexity : O(n)
        // Auxiliary Space : O(1)

        return count;
    }
}
