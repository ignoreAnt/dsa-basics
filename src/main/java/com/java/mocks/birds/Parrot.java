package com.java.mocks.birds;

public class Parrot extends Bird implements Flyable {


    @Override
    public void sound() {
//        super.sound();
        System.out.println("Making sound as parrot");
    }

    @Override
    public void fly() {
        System.out.println("Flying as Parrot");
    }
}
