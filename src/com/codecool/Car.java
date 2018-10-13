package com.codecool;

import java.util.Random;

public class Car extends Vehicle {

    private String[] carNames = {
            "Lightning", "Blizzard", "Fragment", "Bliss", "Onyx", "Pinnacle", "Presence", "Gallop", "Crest", "Flow",
            "Vanish", "Sliver", "Fire", "Passion", "Apex", "Morale", "Presence", "Motion", "Bliss", "Instinct",
            "Resolve", "Marvel", "Blitz", "Evolution", "Crown", "Supremacy", "Fang", "Empyrean", "Raven", "Mirage",
            "Tarragon", "Pinnacle", "Spotlight", "Guerilla", "Bullet", "Chase", "Sprite", "Spire", "Eos", "Elemer"
    };

    public Car() {
        Random randomNumber = new Random();

        //setting speed randomly between 80-110 km/h
        setSpeed(randomNumber.nextInt(30) + 81);

        //setting first and last name randomly from carNames array
        int pickedNumberForFirstName = randomNumber.nextInt(40);
        int pickedNumberForLastName = randomNumber.nextInt(40);
        setName(carNames[pickedNumberForFirstName] + carNames[pickedNumberForLastName]);
    }

    @Override
    public void moveForAnHour(Race race) {
        int actualSpeed = getSpeed();

        if (race.isThereABrokenTruck()) {
            setSpeed(75);
        } else {
            setSpeed(actualSpeed);
        }

        updateDistanceTraveled(getSpeed());
    }

}
