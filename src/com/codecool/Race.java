package com.codecool;

import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;

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
        vehicles.sort(Comparator.comparing(Vehicle::getDistanceTraveled).reversed());
        for (Vehicle vehicle: vehicles) {
            System.out.println("Name: " + vehicle.getName() + " - Type: " + vehicle.getClass().getSimpleName() +
                    " - Distance traveled: " + vehicle.getDistanceTraveled());
        }
    }

    boolean isThereABrokenTruck() {
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getBreakDownTurnsLeft() > 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        race.createVehicles();
        race.simulateRace();
        race.printRaceResults();
    }
}
