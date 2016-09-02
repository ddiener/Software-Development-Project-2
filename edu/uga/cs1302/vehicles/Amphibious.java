package edu.uga.cs1302.vehicles;

import edu.uga.cs1302.vehicles.Interfaces.Floatable;
import edu.uga.cs1302.vehicles.Interfaces.Vehicle;

//this is a class representing objects that can go on land as well as water
public class Amphibious extends Vehicle implements Floatable {
    public int tonnage;
    //tonnage and its effects are the only new addition to the class
    public int getTonnage() {
	return tonnage;
    }
    public void setTonnage(int tonnage) {
	if(tonnage >= 0)
	    this.tonnage = tonnage;
    }

    public Amphibious(int noPassengers, int topSpeed, String name,
		      String manufacturer, int year, int tonnage) {
        if(noPassengers < 0)
            this.noPassengers = 0;
        else
            this.noPassengers = noPassengers;

        if(topSpeed < 0)
            this.topSpeed = 0;
        else
            this.topSpeed = topSpeed;;

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

        if(tonnage < 0)
	    this.tonnage = 0;
        else
	    this.tonnage = tonnage;
        
        instanceCount++;
    }


}

