package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        // Create an ArrayList of Asset objects
        ArrayList<Asset> myAssets = new ArrayList<>();

        // Add 2 houses
        myAssets.add(new House("My Home", "2024-05-14", 250000,
                "123 Jane Lane", 1, 2000, 5000));

        myAssets.add(new House("Vacation Home", "2023-05-20", 300000,
                "1234 Elm st", 2, 1800, 4000));

        // Add 2 vehicles
        myAssets.add(new Vehicle("Dave's Truck", "2023-04-15", 40000,
                "Toyota Tacoma", 2025, 110000));

        myAssets.add(new Vehicle("Vee's Car", "2021-06-10", 28000,
                "Lexus", 2024, 45000));

        // Loop through and display info
        for (Asset asset : myAssets) {
            System.out.println("-----------------------------");
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f\n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f\n", asset.getValue());

            // Use instanceof and downcast
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }
        }
    }
}
