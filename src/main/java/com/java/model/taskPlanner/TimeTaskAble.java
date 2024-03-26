package com.java.model.taskPlanner;

import java.time.LocalDateTime;

public interface TimeTaskAble {

    void start(LocalDateTime dateTime);
    void end(LocalDateTime dateTime);
    void getDuration();
}
