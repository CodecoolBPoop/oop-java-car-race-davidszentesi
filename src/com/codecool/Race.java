package com.codecool;

public class Race {

    public static void main(String[] args) {
        Weather.setRaining();
        System.out.println(Weather.isRaining());

        Car car = new Car();
        System.out.println(car.getName());
        System.out.println(car.getSpeed());

        Motorcycle motor1 = new Motorcycle();
        Motorcycle motor2 = new Motorcycle();
        System.out.println(motor1.getName());
        System.out.println(motor2.getName());

        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        System.out.println(truck1.getName());
        System.out.println(truck2.getName());
    }
}
