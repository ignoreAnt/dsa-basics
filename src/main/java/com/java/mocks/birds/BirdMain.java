package com.java.mocks.birds;

import java.util.ArrayList;
import java.util.List;

public class BirdMain {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Duck duck = new Duck();
        Swan swan = new Swan();
        Swan swan1 = new Swan();
        Swan swan2 = new Swan();
        Swan swan3 = new Swan();

        swan.color = "black";
        swan1.color = "white";
        swan2.color = "grey";
        swan3.color = "grey";


        List<Swan> swans = List.of(swan, swan1, swan2, swan3);
        for (int i = 0; i < swans.size(); i++) {
            for (int j = i + 1; j < swans.size(); j++) {
                if (swans.get(i).color.equals(swans.get(j).color)){
                    System.out.println("true");
                }
            }
        }

        Bird bird = new Parrot();
        bird.setColor("Black");
        System.out.println(bird.getColor());

        List<Flyable> flyables = List.of(parrot, swan);

        List<Bird> birds = new ArrayList<>();
        List<Bird> birdList = List.of(parrot, duck, swan);

        birdList.forEach(Bird::sound);

        for (int i = 0; i < flyables.size(); i++) {
            Flyable f = flyables.get(i);
            f.fly();
        }
    }
}
