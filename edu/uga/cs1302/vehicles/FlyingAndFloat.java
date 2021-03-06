package edu.uga.cs1302.vehicles;

import edu.uga.cs1302.vehicles.Interfaces.Floatable;
import edu.uga.cs1302.vehicles.Interfaces.Flyable;
import edu.uga.cs1302.vehicles.Interfaces.Vehicle;

//this is meant for objects that both float and fly
public class FlyingAndFloat extends Vehicle implements Flyable, Floatable {
    public int maxAltitude;
    public int maxRange;
    public int tonnage;

    public int getMaxAltitude() {
        return maxAltitude;
    }
    public void setMaxAltitude(int maxAltitude) {
        if(maxAltitude >= 0)
            this.maxAltitude = maxAltitude;
    }
    public int getMaxRange() {
        return maxRange;
    }
    public void setMaxRange(int maxRange) {
        if(maxRange >= 0)
            this.maxRange = maxAltitude;
    }
    public int getTonnage() {
        return tonnage;
    }
    public void setTonnage(int tonnage) {
        if(tonnage >= 0)
            this.tonnage = tonnage;
    }

    public FlyingAndFloat(int noPassengers, int topSpeed, String name,
                          String manufacturer, int year, int maxAltitude,
                          int maxRange, int tonnage) {
        if(noPassengers < 0)
            this.noPassengers = 0;
        else
            this.noPassengers = noPassengers;

        if(topSpeed < 0)
            this.topSpeed = 0;
        else
            this.topSpeed = topSpeed;

        if(name.equals(null))
            this.name = "None given.";
        else
            this.name = name;

        if(manufacturer.equals(null))
            this.manufacturer = "None given.";
        else
            this.manufacturer = manufacturer;

        if(year > 2014)
            this.year = 2014;
        else
            this.year = year;

        if(maxAltitude < 0)
            this.maxAltitude = 0;
        else
            this.maxAltitude = maxAltitude;

        if(maxRange < 0)
            this.maxRange = 0;
        else
            this.maxRange = maxRange;

        if(tonnage < 0)
            this.tonnage = 0;
        else
            this.tonnage = tonnage;

        if(manufacturer.equals(null))
            this.manufacturer = "None given.";
        else
            this.manufacturer = manufacturer;

        if(year > 2014)
            this.year = 2014;
        else
            this.year = year;

        if(maxAltitude < 0)
            this.maxAltitude = 0;
        else
            this.maxAltitude = maxAltitude;

        if(maxRange < 0)
            this.maxRange = 0;
        else
            this.maxRange = maxRange;

        if(tonnage < 0)
            this.tonnage = 0;
        else
            this.tonnage = tonnage;

        instanceCount++;
    }
}

