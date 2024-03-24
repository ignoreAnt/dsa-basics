package com.java.mocks.birds;

public class Swan  extends  Bird implements Flyable, Swimable{

    @Override
    public void sound() {
        System.out.println("Making sound as swan");
    }

    @Override
    public void fly() {
        System.out.println("Flying as Swan");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

}
