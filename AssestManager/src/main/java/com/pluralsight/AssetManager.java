package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        final String GREEN = "\u001B[32m";
        final String RESET = "\u001B[0m";

        ArrayList<Asset> myAssets = new ArrayList<>();

        // Add Houses
        myAssets.add(new Building("My House", "2024-05-01", 200000,
                "123 Elm Street", 1, 1800, 3000));
        myAssets.add(new Building("Family Home", "2025-05-13", 150000,
                "456 Lake View", 2, 1200, 4000));

        // Add Vehicles
        myAssets.add(new Vehicle("Dave's Truck", "2025-05-11", 28000,
                "Toyota Tacoma", 2025, 85000));
        myAssets.add(new Vehicle("Jane's Car", "2024-11-01", 15000,
                "Ford Focus", 2010, 135000));

        // Display all assets
        System.out.println("Family Assets:");
        for (Asset asset : myAssets) {
            System.out.println(GREEN + asset + RESET); // toString() handles all info
        }
    }
}
