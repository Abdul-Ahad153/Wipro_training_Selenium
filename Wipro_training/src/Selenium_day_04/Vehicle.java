package Selenium_day_04;

// Abstract class
abstract class Vehicle1 {
    // Abstract methods
    abstract void speed();
    abstract void brand();

    // Concrete method
    void fuelType() {
        System.out.println("All vehicles need fuel or electricity.");
    }
}

// Subclass implementing abstract methods
class Car extends Vehicle1 {
    @Override
    void speed() {
        System.out.println("Car speed is 220 km/h.");
    }

    @Override
    void brand() {
        System.out.println("Brand: BMW");
    }
}

class Bike extends Vehicle1{
	 void speed() {
	        System.out.println("Bike speed is 220 km/h.");
	    }

	    @Override
	    void brand() {
	        System.out.println("Brand: Pulsar");
	    }
}

// Main class to run the program
public class Vehicle {
    public static void main(String[] args) {
        // Polymorphism: Vehicle1 reference = Car object
        Vehicle1 car = new Car();
        Vehicle1 bike = new Bike();
        car.speed();       
        car.brand();      
        car.fuelType();    // Inherited concrete method from Vehicle1
        
        bike.speed();       
        bike.brand();       
        bike.fuelType();
    }
}
