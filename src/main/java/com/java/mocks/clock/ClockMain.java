package com.java.mocks.clock;

import com.java.mocks.birds.Bird;
import com.java.mocks.birds.Parrot;

public class ClockMain {
    public static void main(String[] args) {
        Clock myClock = new Clock("black", "Round", true);
        Clock yourClock = new Clock("White", "Square", false);

        boolean equals = myClock.equals(yourClock);

    }
}
