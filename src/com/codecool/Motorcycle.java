package com.codecool;

public class Motorcycle extends Vehicle {

    private static int nameNumber = 1;

    public Motorcycle() {
        setSpeed(100);
        setName("Motorcycle " + nameNumber++);
    }
}
