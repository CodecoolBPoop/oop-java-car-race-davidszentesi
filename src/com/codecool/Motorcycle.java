package com.codecool;

import java.util.Random;

public class Motorcycle extends Vehicle {

    private static int nameNumber = 1;

    public Motorcycle() {
        setSpeed(100);
        setName("Motorcycle " + nameNumber++);
    }

    @Override
    public void moveForAnHour(Race race) {
        Random randomNumber = new Random();
        int pickedNumberForSlowing = randomNumber.nextInt(45) + 6;

        if (Weather.isRaining()) {
            if (race.isThereABrokenTruck() && (100 - pickedNumberForSlowing) > 75) {
                updateDistanceTraveled(75);
            } else if (race.isThereABrokenTruck() && (100 - pickedNumberForSlowing) < 75) {
                updateDistanceTraveled(100 - pickedNumberForSlowing);
            }
        } else if (!Weather.isRaining() && race.isThereABrokenTruck()) {
            updateDistanceTraveled(75);
        } else {
            updateDistanceTraveled(getSpeed());
        }
    }
}
