package com.codecool;

import java.util.Random;

public class Truck extends Vehicle {

    public Truck() {
        setSpeed(100);

        Random randomNumber = new Random();
        setName("Truck " + randomNumber.nextInt(1001));
    }

    @Override
    public void moveForAnHour(Race race) {
        Random randomNumber = new Random();
        int pickedNumberForBreakDown = randomNumber.nextInt(100) + 1;

        if (pickedNumberForBreakDown <= 5 && getBreakDownTurnsLeft() == 0) {
            updateDistanceTraveled(0);
            setBreakDownTurnsLeft(2);
        } else if (getBreakDownTurnsLeft() > 0) {
            updateDistanceTraveled(0);
            int breakDownTurnsLeft = getBreakDownTurnsLeft();
            setBreakDownTurnsLeft(breakDownTurnsLeft - 1);
        }

        if (race.isThereABrokenTruck() && getBreakDownTurnsLeft() == 0) {
            updateDistanceTraveled(75);
        } else if (!race.isThereABrokenTruck() && getBreakDownTurnsLeft() == 0){
            updateDistanceTraveled(getSpeed());
        }
    }
}
