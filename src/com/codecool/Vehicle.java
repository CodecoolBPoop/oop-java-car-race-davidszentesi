package com.codecool;

public abstract class Vehicle {

    private int speed;
    private String name;
    int distanceTraveled = 0;

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveForAnHour(Race race) {
        // update distanceTraveled
    }
}
