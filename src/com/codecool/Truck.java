package com.codecool;

import java.util.Random;

public class Truck extends Vehicle {

    public Truck() {
        setSpeed(100);

        Random randomNumber = new Random();
        setName("Truck " + randomNumber.nextInt(1001));
    }

    public void moveForAnHour(Race race) {
        updateDistanceTraveled(getSpeed());
    }
}
