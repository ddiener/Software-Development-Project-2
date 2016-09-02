package edu.uga.cs1302.vehicles;

import edu.uga.cs1302.vehicles.Interfaces.Vehicle;

//this is the automobile class utilizing the interfaces in the previous class
public class Automobile extends Vehicle {
    public int horsepower;

    public int getHorsepower() {
        return horsepower;
    }
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public Automobile(int noPassengers, int topSpeed, String name,
                      String manufacturer, int year, int horsepower) {
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

        if(horsepower < 0)
            this.horsepower = 0;
        else
            this.horsepower = horsepower;

        instanceCount++;
    }
}
