package com.codecool;

public abstract class Vehicle {

    private int speed;
    private String name;
    private int distanceTraveled = 0;
    private int breakDownTurnsLeft = 0;

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

    int getBreakDownTurnsLeft() {
        return breakDownTurnsLeft;
    }

    void setBreakDownTurnsLeft(int breakDownTurnsLeft) {
        this.breakDownTurnsLeft = breakDownTurnsLeft;
    }

    abstract void moveForAnHour(Race race);
}
