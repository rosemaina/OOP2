
// Create an Abstract class called Vehicle with abstract methods accelerate, stop, and gas, & data of your choice.(5 marks)
public abstract class Vehicle {
	String fueltype;
	
    public abstract void accelerate(int y);
    public abstract void gas();
    public abstract void stop();
    
    public void overTakeBy(int x) {
		System.out.println("The vehicle overtook " + x + " cars on the highway.");
	};

	 // Create a main class and create an instance of class Sedan in its main method. Demonstrate method overloading and overriding using method accelerate() (10 marks)
	public static void main(String[] args) {
		Sedan sedan = new Sedan();

		sedan.overTakeBy(50);
		sedan.accelerate(20);
		sedan.accelerate(40.897);
	}
}

// Create an Interface called Automobile defining a number of logical data and methods.(5 marks)
interface Automobile { 

    int numberOfSpeakers = 4; 
    int hasSpeakers = false; 

	public boolean hasTurbo();
}

// Create subclasses Motorcycle & Bus as children of class Vehicle overriding the necessary methods (5 marks)
class Motorcycle extends Vehicle {
	public void accelerate() {
		System.out.println("The boda is speeding");
	}

	public void gas(){
		System.out.println("We are running low on gas");
	}

	public void stop() {
		System.out.println("The boda stopped");
	}
}
 
 class Bus extends Vehicle {
	public void accelerate() {
		System.out.println("The bus is speeding");
	}

	public void gas(){
		System.out.println("We are running low on gas");
	}

	public void stop() {
		System.out.println("The bu stopped. It has no gas.");
	}

	public void busTicket() {
		Bus bus = new Bus();
		bus.overTakeBy(10);
	 }
 }

class LuxuryBus extends Bus { }
 
class SchoolBus extends Bus { }

 // Create a class Sedan and SportsCar using the Interface Automobile and Abstract Class Vehicle appropriately (5 marks)
class Sedan extends Vehicle implements Automobile{
	
	@Override
	public void accelerate(int a) {
		System.out.println("The sedan accelerated by: " + a + "km/hr");
	}
	
	public void accelerate(double a) {
		System.out.println("The sedan accelerated by: " + a+ "km/hr");
	}
	
	public void stop() {
	System.out.println("The sedan stopped");
	}
	
	public void gas() {
		System.out.println("The sedan stopped for gas");
	}
	
	public boolean hasTurbo() {
		return false;
	}
}

class SportsCar extends Vehicle implements Automobile {

	public void stop() {
		System.out.println("The ferrari stopped");
	}
	
	public void gas() {
		System.out.println("The ferrari stopped for some gas");
	}
	
	public boolean hasTurbo() {
		return true;
	}
}