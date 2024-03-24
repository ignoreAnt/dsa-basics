package com.java.mocks.birds;

public abstract class Bird {

    protected String color;

     String beakType;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }

    protected abstract void sound();

}
