package edu.uga.cs1302.vehicles;

import edu.uga.cs1302.vehicles.Interfaces.Flyable;
import edu.uga.cs1302.vehicles.Interfaces.Vehicle;

public class Airplane extends Vehicle implements Flyable {
    public int numEngines;
    public int maxAltitude;
    public int maxRange;

    public int getMaxAltitude() {
        return maxAltitude;
    }
    public void setMaxAltitude(int maxAltitude) {
        if(maxAltitude > 0)
            this.maxAltitude = maxAltitude;
    }
    public int getMaxRange() {
        return maxAltitude;
    }
    public void setMaxRange(int maxRange) {
        if(maxRange > 0)
            this.maxRange = maxRange;
    }
    public int getNumEngines() {
        return numEngines;
    }
    public void setNumEngines(int numEngines) {
        this.numEngines = numEngines;
    }

    public Airplane(int noPassengers, int topSpeed, String name,
                    String manufacturer, int year, int numEngines,
                    int maxAltitude, int maxRange) {
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

        if(numEngines < 0)
            this.numEngines = 0;
        else
            this.numEngines = numEngines;

        if(maxAltitude < 0)
            this.maxAltitude = 0;
        else
            this.maxAltitude = maxAltitude;

        if(maxRange < 0)
            this.maxRange = 0;
        else
            this.maxRange = maxRange;

        instanceCount++;
    }
}
