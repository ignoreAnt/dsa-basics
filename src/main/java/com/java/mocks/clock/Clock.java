package com.java.mocks.clock;

public class Clock { // Every Class is the blueprint for the object

    // Properties / Attributes
    private String color;
    private String shape;
    private Boolean isAnalogue;

    public Clock(String color, String shape, Boolean isAnalogue) {
        this.color = color;
        this.shape = shape;
        this.isAnalogue = isAnalogue;
    }

    // Behaviours / Actions
    public void setAlarm(){}

    public void showTime(){}

    public void adjustTime(){}

    public void turnOnLight(){}
}
