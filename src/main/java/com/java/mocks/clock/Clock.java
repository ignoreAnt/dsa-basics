package com.java.mocks.clock;

import java.util.Objects;

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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Clock clock = (Clock) o;
//
//        if (!Objects.equals(color, clock.color)) return false;
//        if (!Objects.equals(shape, clock.shape)) return false;
//        return Objects.equals(isAnalogue, clock.isAnalogue);
//    }

    @Override
    public boolean equals(Object o) {
        // If they are pointing to the same memory location
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Clock clock = (Clock) o;
        return Objects.equals(color, clock.color)
                && Objects.equals(shape, clock.shape)
                && Objects.equals(isAnalogue, clock.isAnalogue);
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (shape != null ? shape.hashCode() : 0);
        result = 31 * result + (isAnalogue != null ? isAnalogue.hashCode() : 0);
        return result;
    }
}
