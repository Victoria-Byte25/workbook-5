package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== PART 1: Using Setters ====");


        Moped slowRide = new Moped("Default", 0, 0, 0);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(1);

        Car weekendCruiser = new Car("Default", 0, 0, 0);
        weekendCruiser.setColor("Red");
        weekendCruiser.setFuelCapacity(12);
        weekendCruiser.setNumberOfPassengers(4);

        SemiTruck hauler = new SemiTruck("Default", 0, 0, 0);
        hauler.setColor("Black");
        hauler.setCargoCapacity(10000);
        hauler.setFuelCapacity(50);

        Hovercraft zoomZoom = new Hovercraft("Default", 0, 0, 0);
        zoomZoom.setColor("Matt Green");
        zoomZoom.setFuelCapacity(15);
        zoomZoom.setNumberOfPassengers(3);

        //  Print results
        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Car passengers: " + weekendCruiser.getNumberOfPassengers());
        System.out.println("Truck cargo capacity: " + hauler.getCargoCapacity());
        System.out.println("Hovercraft fuel: " + zoomZoom.getFuelCapacity());

        System.out.println("\n==== PART 2: Using Constructors ====");

        Moped newRide = new Moped("Green", 1, 0, 6);
        Car roadTrip = new Car("Black", 5, 3, 15);
        SemiTruck beastTruck = new SemiTruck("Eggshell", 2, 25000, 40);
        Hovercraft spaceZoom = new Hovercraft("Pink", 2, 2, 20);

        System.out.println("Moped color: " + newRide.getColor());
        System.out.println("Car passengers: " + roadTrip.getNumberOfPassengers());
        System.out.println("Truck cargo capacity: " + beastTruck.getCargoCapacity());
        System.out.println("Hovercraft fuel: " + spaceZoom.getFuelCapacity());
    }
}

