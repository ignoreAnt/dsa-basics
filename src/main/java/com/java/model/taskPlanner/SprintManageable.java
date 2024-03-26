package com.java.model.taskPlanner;

import java.time.Duration;
import java.util.List;

public interface SprintManageable {

    void changeDuration(Duration duration);
    void addAllTasks(List<Task> tasks);

    void addTask(Task task);
    void removeTask(Task task);
    void sortTasks();
    void filterTasks();
}
