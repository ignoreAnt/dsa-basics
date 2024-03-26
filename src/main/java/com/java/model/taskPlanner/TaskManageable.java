package com.java.model.taskPlanner;

public interface TaskManageable {

    //
    void ownTask();
    void transferTask(User user);
    void assignTaskType(TaskType taskType);

    TaskStatus getTaskStatus();
}
