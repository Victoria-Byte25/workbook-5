package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Matt Black");
        slowRide.setFuelCapacity(7);

        Car myCar = new Car();
        myCar.setColor("Blue");
        myCar.setFuelCapacity(10);
        myCar.setNumberOfPassengers(2);

        SemiTruck hauler = new SemiTruck();
        hauler.setCargoCapacity(10000);
        hauler.setColor("Black");

        Hovercraft zoomer = new Hovercraft();
        zoomer.setColor("Silver");
        zoomer.setFuelCapacity(10);

        // Print values to test
        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Car passengers: " + myCar.getNumberOfPassengers());
        System.out.println("Truck cargo: " + hauler.getCargoCapacity());
        System.out.println("Hovercraft fuel: " + zoomer.getFuelCapacity());
    }
}

