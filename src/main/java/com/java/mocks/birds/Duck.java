package com.java.mocks.birds;

public class Duck extends Bird implements Swimable{

    @Override
    public void sound() {
        System.out.println("Making sound as a Duck");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    public void describe(){
        System.out.println(super.color);
    }
}
