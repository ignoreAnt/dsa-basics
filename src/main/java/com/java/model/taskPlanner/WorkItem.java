package com.java.model.taskPlanner;

public abstract class WorkItem {
    //sharing id, name, description across subclass
    private String id ;
    private String Name;
    private String description;

    public abstract void getCompletionPercentage();
}
