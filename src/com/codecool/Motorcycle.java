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
            setSpeed(100 - pickedNumberForSlowing);

            int actualSpeed = getSpeed();

            if (race.isThereABrokenTruck() && getSpeed() > 75) {
                setSpeed(75);
            } else if (!race.isThereABrokenTruck()) {
                setSpeed(actualSpeed);
            }
        }

        updateDistanceTraveled(getSpeed());
    }
}
