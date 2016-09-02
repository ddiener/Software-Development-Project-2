package edu.uga.cs1302.vehicles;

import edu.uga.cs1302.vehicles.Interfaces.Vehicle;

//this is the ship class that would not be possible wihout the interface java file
public class Ship extends Vehicle {
    public String shippingLineOwner;
    public int tonnage;

    public int getTonnage() {
        return tonnage;
    }
    public void setTonnage(int tonnage) {
        if(tonnage > 0)
            this.tonnage = tonnage;
    }
    public String getShippingLineOwner() {
        return shippingLineOwner;
    }
    public void setShippingLineOwner(String shippingLineOwner) {
        this.shippingLineOwner = shippingLineOwner;
    }

    public Ship(int noPassengers, int topSpeed, String name,
                String maufacturer, int year,
                String shippingLineOwner, int tonnage) {
        if(noPassengers < 0)
            this.noPassengers = 0;
        else
            this.noPassengers = noPassengers;

        if(topSpeed < 0)
            this.topSpeed = topSpeed;
        else
            this.topSpeed = topSpeed;

        if(name.equals(null))
            this.name = "None given.";
        else
            this.name = name;
        String newManufacturer = manufacturer;
        this.manufacturer = newManufacturer;

        if(year > 2014)
            this.year = 2014;
        else
            this.year = year;

        if(shippingLineOwner.equals(null))
            this.shippingLineOwner = "None given.";
        else
            this.shippingLineOwner = shippingLineOwner;

        if(tonnage < 0)
            this.tonnage = 0;
        else
            this.tonnage = tonnage;

        instanceCount++;
    }
}

