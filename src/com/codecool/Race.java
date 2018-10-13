package com.codecool;

import java.util.LinkedList;
import java.util.List;

public class Race {

    private List<Vehicle> vehicles = new LinkedList<>();

    private void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());
            vehicles.add(new Truck());
            vehicles.add(new Motorcycle());
        }
    }

    private void simulateRace() {
        for (int i = 0; i < 50; i++) {
            Weather.setRaining();
            for (Vehicle vehicle: vehicles) {
                vehicle.moveForAnHour(this);
            }
        }
    }

    private void printRaceResults() {
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.getName() + ": " + vehicle.getDistanceTraveled());
        }
    }

    public static void main(String[] args) {
        Race race = new Race();
        race.createVehicles();
        race.simulateRace();
        race.printRaceResults();
    }
}
