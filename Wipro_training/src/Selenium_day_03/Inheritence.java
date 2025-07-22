package Selenium_day_03;
class Vehicle {
	void start() {
		System.out.println("Vehicle is Starting....");
	}
	void stop() {
		System.out.println("Vehicle is Stoping....");
	}
}	
	class Car extends Vehicle{
		void airconditioning() {
			System.out.println("Car AC is ON....");
		}
		
	}
	class Bike extends Vehicle{
		void kickStarts() {
			System.out.println("Bike is kick-started...");
		}
	}
	

public class Inheritence {
	public static void main(String[]args) {
		Car myCar = new Car(); 
		myCar.start();            // inherited from Vehicle
        myCar.airconditioning();  // Car-specific
        myCar.stop();             // inherited

        System.out.println();
        
        Bike myBike = new Bike();
        myBike.start();
        myBike.kickStarts();
        myBike.stop();
        System.out.println();
        
	}
	

}
