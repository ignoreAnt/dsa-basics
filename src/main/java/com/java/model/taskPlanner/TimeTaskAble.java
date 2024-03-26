package com.java.model.taskPlanner;

import java.time.LocalDateTime;

public interface TimeTaskAble {

   public void start(LocalDateTime dateTime);
    public void end(LocalDateTime dateTime);
    public void getDuration ();
}
