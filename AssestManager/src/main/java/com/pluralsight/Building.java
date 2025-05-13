package com.pluralsight;

import java.text.NumberFormat;

public class Building extends Asset {
    private String address;
    private int condition;  // 1=Excellent, 2=Good, 3=Fair, 4=Poor
    private int squareFoot;
    private int lotSize;

    public Building(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double basePricePerSqFt = switch (condition) {
            case 1 -> 180.0;
            case 2 -> 130.0;
            case 3 -> 90.0;
            case 4 -> 80.0;
            default -> 0.0;
        };
        return (basePricePerSqFt * squareFoot) + (0.25 * lotSize);
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return super.toString() + " | Address: " + address;
    }
}

