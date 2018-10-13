package com.codecool;

public abstract class Vehicle {

    private int speed;
    private String name;
    private int distanceTraveled = 0;

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void updateDistanceTraveled(int distance) {
        distanceTraveled += distance;
    }

    abstract void moveForAnHour(Race race);
}
