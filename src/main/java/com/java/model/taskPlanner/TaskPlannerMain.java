package com.java.model.taskPlanner;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class TaskPlannerMain {
    public static void main(String[] args) {
        UserImpl user = new UserImpl();

        Task task = new Task("1001", "firstTask", "first Task", TaskType.BUG);
        Task task1 = new Task("1002", "secondTask", "second Task", TaskType.FEATURE);
        Task task2 = new Task("1003", "thirdTask", "third Task", TaskType.STORY);
        Task task3 = new Task("1004", "fourthTask", "fourth Task", TaskType.BUG);
        Task task4 = new Task("1005", "fifthTask", "fifth Task", TaskType.BUG);

        Sprint sprint = new Sprint("S1001", "firstSprint", "first Sprint", Duration.ofDays(7));
        List<Task> bugs = List.of(task, task3, task4);
        sprint.addAllTasks(bugs);
        sprint.addTask(task1);
        sprint.addTask(task2);
        sprint.getCompletionPercentage();

        System.out.println(sprint.getTasks());
//        sprint.sortTasks();
        sprint.getTasks().sort(Comparator.comparingInt(taskOne -> taskOne.name.length()));
        System.out.println(sprint.getTasks());
        sprint.getTasks().sort(Comparator.comparing(o -> o.description));
        System.out.println(sprint.getTasks());



        task.setTaskStatus(TaskStatus.IN_PROGRESS);
        task1.setTaskStatus(TaskStatus.COMPLETED);
        task2.setTaskStatus(TaskStatus.IN_PROGRESS);
        task3.setTaskStatus(TaskStatus.CLOSED);
        task4.setTaskStatus(TaskStatus.COMPLETED);

        sprint.getCompletionPercentage();
    }
}
