import edu.uga.cs1302.vehicles.*;
import java.util.Scanner; 
import edu.uga.cs1302.vehicles.Interfaces.Vehicle;

public class Main {

    public static void main(String[] args) {
	//this is the array that will contain all of the objects
	Vehicle[] projectArray = new Vehicle[15];
	
	//each object of each class must be created with given parameters
	Automobile car1 = new Automobile(5, 97, "S70", "Volvo", 2000, 200);
	Automobile car2 = new Automobile(7, 320, "Quest", "Nissan", 2010, 300);
	Automobile car3 = new Automobile(2, 200, "Adventador", "Lambourghini", 2014, 720);
	
	Ship ship1 = new Ship(1370, 20, "S.S. Titanic", "RMS Incorporated", 1924, "Pie Line", 14000);
	Ship ship2 = new Ship(2000, 35, "S.S. Lulluby", "Hillside Incorporated", 1974, "Custard Line", 20000);
	Ship ship3 = new Ship(2340, 40, "S.S. Sweetums", "Rubber Stamp Incorporated", 1986, "Cake Line", 21000);
	
	Airplane plane1 = new Airplane(120, 210, "Rickety Flyer", "Riverside Manufacturing", 1971, 3, 30000, 5010);
	Airplane plane2 = new Airplane(160, 240, "Bumpy Flyer", "Lakeside Manufacturing", 1983, 4, 35000, 5970);
	Airplane plane3 = new Airplane(200, 260, "Smooth Flyer", "Mountainside Manufacturing", 1995, 5, 40000, 6340);
	
	FlyingAndFloat derp1 = new FlyingAndFloat(3, 120, "Plane Converter Prototype", "Zapdos Inc.", 1934, 24000, 4010, 13000);
	FlyingAndFloat derp2 = new FlyingAndFloat(4, 140, "Water-2-Air Convertible", "Moltres Inc.", 1947, 27000, 4510, 12000);
	FlyingAndFloat derp3 = new FlyingAndFloat(5, 160, "Luxury Water-plane", "Articuno Inc.", 1958, 29000, 5000, 11000);
	
	Amphibious frog1 = new Amphibious(3, 34, "Tadpole Prototype", "Squirtle Inc.", 1923, 10000);
	Amphibious frog2 = new Amphibious(4, 44, "Frog Hopper", "Bulbasaur Inc.", 1934, 9000);
	Amphibious frog3 = new Amphibious(5, 54, "Toad Traveller", "Charmander Inc.", 1945, 8000);
	
	//each of the created objects are stored in the array
	projectArray[0] = car1;
	projectArray[1] = car2;
	projectArray[2] = car3;
	projectArray[3] = ship1;
	projectArray[4] = ship2;
	projectArray[5] = ship3;
	projectArray[6] = plane1;
	projectArray[7] = plane2;
	projectArray[8] = plane3;
	projectArray[9] = derp1;
	projectArray[10] = derp2;
	projectArray[11] = derp3;
	projectArray[12] = frog1;
	projectArray[13] = frog2;
	projectArray[14] = frog3;
	
	//the scanner must be rought in so the keyboard can be utilized
	Scanner keyboard = new Scanner(System.in);
	String userInput = "h";
	
	//the way this loop is written, unless the user explicitly closes the program, then the menu keeps reappearing
	while(!userInput.equals("q")) {
	    System.out.println("Press 1 to see how many vehicles are in the system.");
	    System.out.println("Press 2 to see the name and each kind of vehicle.");
	    System.out.println("Press 3 to see which vehicles can fly.");
	    System.out.println("Press 4 to see which vehicles can float.");
	    System.out.println("Press 5 to see which vehicles can float AND fly.");
	    System.out.println("Press 6 to see a brief description of each vehicle.");
	    System.out.println("Press h to see brief help information for the system.");
	    System.out.println("Press q to terminate the program.");
	    System.out.println();
	    System.out.print("Please enter your choice: ");
	    userInput = keyboard.next();
	    System.out.println();
	    
	    //this just references the static variable in the vehicle abstract class and prints that value to the screen
	    if(userInput.equals("1")) {
		System.out.println(Vehicle.getInstanceCount());
	    }
	    
	    //this option uses a for loop to go through all of the entries and prints two of each of the objects' attributes
	    else if(userInput.equals("2")) {
		for(int n = 0; n < projectArray.length; n++) {
		    System.out.print("Type: ");
		    if(projectArray[n] instanceof Automobile)
			System.out.print("Automobile\n");
		    else if(projectArray[n] instanceof Airplane)
			System.out.print("Airplane\n");
		    else if(projectArray[n] instanceof Ship)
			System.out.print("Ship\n");
		    else if(projectArray[n] instanceof Amphibious)
			System.out.print("Amphibious Vehicle\n");
		    else
			System.out.print("Floating and Flying Vehicle\n");
		    System.out.println("Name: " + projectArray[n].getName());
		}
	    }
	    
	    //this option checks for those objects that can fly and prints those that can
	    else if(userInput.equals("3")) {
		for(int m = 0; m < projectArray.length; m++) {
		    if(projectArray[m] instanceof Airplane) {
			System.out.println("Type: Airplane");
			System.out.println("Name: " + projectArray[m].getName()); }
		    if(projectArray[m] instanceof FlyingAndFloat) {
			System.out.println("Type: Flying and Floating Vehicle");
			System.out.println("Name: " + projectArray[m].getName()); }
		}
	    }
	    
	    //this input checks for objects that can float and prints those that can
	    else if(userInput.equals("4")) {
		for(int m = 0; m < projectArray.length; m++) {
		    if(projectArray[m] instanceof Ship || projectArray[m] instanceof Amphibious) {
			System.out.print("Type: ");
			if(projectArray[m] instanceof Ship)
			    System.out.print("Ship\n");
			else
			    System.out.print("Amphibious Vehicle\n");
			System.out.println("Name: " + projectArray[m].getName()); }
		}
	    }
	    //the program checks to see if each object can both fly and float and then prints those that can
	    else if(userInput.equals("5")) {
		for(int m = 0; m < projectArray.length; m++) {
		    if(projectArray[m] instanceof FlyingAndFloat) {
			System.out.println("Type: Floating and Flying Vehicle");
			System.out.println("Name: " + projectArray[m].getName()); }
		}
	    }
	    
	    //this input prints each of the objects' attributes according to their class using the "instanceof" keyword
	    else if(userInput.equals("6")) {
		for(int m = 0; m < projectArray.length; m++) {
		    System.out.println();
		    if(projectArray[m] instanceof Automobile) {
			System.out.println("Type: Automobile");
			System.out.print("Name: " + projectArray[m].getName() + "\n");
			System.out.print("Manufacturer: " + projectArray[m].getManufacturer() + "\n");
			System.out.print("Manufacture year: " + projectArray[m].getYear() + "\n");
			System.out.print("Engine power: " + ((Automobile) projectArray[m]).getHorsepower() + " hp\n");
			System.out.print("Number of passengers: " + projectArray[m].getNoPassengers() + "\n");
			System.out.print("Top speed: " + projectArray[m].getTopSpeed() + " mph\n");
		    }
		    else if(projectArray[m] instanceof Airplane) {
			System.out.println("Type: Airplane");
			System.out.print("Name: " + projectArray[m].getName() + "\n");
			System.out.print("Manufacturer: " + projectArray[m].getManufacturer() + "\n");
			System.out.print("Manufacture year: " + projectArray[m].getYear() + "\n");
			System.out.print("Number of engines: " + ((Airplane) projectArray[m]).getNumEngines() + "\n");
			System.out.print("Max altitude: " + ((Airplane) projectArray[m]).getMaxAltitude() + "ft\n");
			System.out.print("Max range: " + ((Airplane) projectArray[m]).getMaxRange() + "mi\n");
			System.out.print("Number of passengers: " + projectArray[m].getNoPassengers() + "\n");
			System.out.print("Top speed: " + projectArray[m].getTopSpeed() + " mph\n");
		    }
		    else if(projectArray[m] instanceof Ship) {
			System.out.println("Type: Ship");
			System.out.print("Name: " + projectArray[m].getName() + "\n");
			System.out.print("Manufacturer: " + projectArray[m].getManufacturer() + "\n");
			System.out.print("Manufacture year: " + projectArray[m].getYear() + "\n");
			System.out.print("Tonnage: " + ((Ship) projectArray[m]).getTonnage() + "t\n");
			System.out.print("Owner: " + ((Ship) projectArray[m]).getShippingLineOwner() + "\n");
			System.out.print("Number of passengers: " + projectArray[m].getNoPassengers() + "\n");
			System.out.print("Top speed: " + projectArray[m].getTopSpeed() + " mph\n");
		    }
		    else if(projectArray[m] instanceof Amphibious) {
			System.out.println("Type: Amphibious Vehicle");
			System.out.print("Name: " + projectArray[m].getName() + "\n");
			System.out.print("Manufacturer: " + projectArray[m].getManufacturer() + "\n");
			System.out.print("Manufacture year: " + projectArray[m].getYear() + "\n");
			System.out.print("Tonnage: " + ((Amphibious) projectArray[m]).getTonnage() + "t\n");
			System.out.print("Number of passengers: " + projectArray[m].getNoPassengers() + "\n");
			System.out.print("Top speed: " + projectArray[m].getTopSpeed() + " mph\n");
		    }
		    else {
			System.out.println("Type: Floating and Flying Vehicle");
			System.out.print("Name: " + projectArray[m].getName() + "\n");
			System.out.print("Manufacturer: " + projectArray[m].getManufacturer() + "\n");
			System.out.print("Manufacture year: " + projectArray[m].getYear() + "\n");
			System.out.print("Max altitude: " + ((FlyingAndFloat) projectArray[m]).getMaxAltitude() + "ft\n");
			System.out.print("Max range: " + ((FlyingAndFloat) projectArray[m]).getMaxRange() + "mi\n");
			System.out.print("Tonnage: " + ((FlyingAndFloat) projectArray[m]).getTonnage() + "t\n");
			System.out.print("Number of passengers: " + projectArray[m].getNoPassengers() + "\n");
			System.out.print("Top speed: " + projectArray[m].getTopSpeed() + " mph\n"); }
		    
		}
	    }
	    
	    //If the user inputs "h" for help, then a brief message will appear to assist the user
	    else if(userInput.equals("h")) {
		System.out.println();
		System.out.println("Press the keys that are stated on the menu screen to execute actions!");
		System.out.println();
	    }
	    
	    //If the user inputs "q" then the program closes itself
	    else if(userInput.equals("q")) {
		System.out.println();
		System.out.println("Goodbye!");
		System.exit(0);
		
	    }
	    
	    //This else statement accounts for all other possible inputs. It informs the user of the incorrect
	    //input and prints the menu screen again
	    else {
		System.out.println();
		System.out.println("Your input was invalid. Please try again!");
		System.out.println();
	    }
	    
	}
	
	
    }

}