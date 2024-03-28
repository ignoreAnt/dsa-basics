package com.java.model.taskPlanner;

public abstract class WorkItem {
    //sharing id, name, description across subclass
    protected String id ;
    protected String name;
    protected String description;
}