//this class contains all of the abstract classes and interfaces that will be used through out the program 
package edu.uga.cs1302.vehicles;

public class Interfaces {
    public interface Moveable {
	public int getNoPassengers();
	public void setNoPassengers(int noPassengers);
	public int getTopSpeed();
	public void setTopSpeed(int topSpeed);
    }

    public interface Flyable {
	public int getMaxAltitude();
	public void setMaxAltitude(int maxAltitude);
	public int getMaxRange();
	public void setMaxRange(int maxRange);
    }

    public interface Floatable {
	public int getTonnage();
	public void setTonnage(int tonnage);
    }

    //all data members are public in order to avoid data restriction. otherwise, I would have them as protected
    public abstract static class Vehicle implements Moveable {
	public String name;
	public String manufacturer;
	public int year;
	public static int instanceCount;
	public int noPassengers;
	public int topSpeed;
    
	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    if(!name.equals(null))
		this.name = name;
	}
	public String getManufacturer() {
	    return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
	    if(!manufacturer.equals(null))
		this.manufacturer = manufacturer;
	}
	public int getYear() {
	    return year;
	}
	public void setYear(int year) {
	    if(year < 2014)
		this.year = year;
	}
	public static int getInstanceCount() {
	    return instanceCount;
	}
    
	public int getNoPassengers() {
	    return noPassengers;
	}
	public void setNoPassengers(int noPassengers) {
	    if(noPassengers >= 0)
		this.noPassengers = noPassengers;
	}
	public int getTopSpeed() {
	    return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
	    if(topSpeed >= 0)
		this.topSpeed = topSpeed;
	}
    }
}