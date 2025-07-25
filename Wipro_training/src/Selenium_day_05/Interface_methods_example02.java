package Selenium_day_05;


interface Device{
	void turnOn();
	default void Status() {
		System.out.println("the device is on ");

	}
	static void Companyinfo() {
		System.out.println("this is of some good company");

	}
}
class Fan implements Device {
	public void turnOn() {
		System.out.println("The fan is On");
		
	}
	public void Status() {
		System.out.println("the fan is off now ");

	}
	
}
class Light implements Device {
	public void turnOn() {
		System.out.println("The light is On");
		
	}
	public void Status() {
		System.out.println("the light is off now ");

	}
	
}
class Ac implements Device {
	public void turnOn() {
		System.out.println("The Ac is On");
		
	}
}
public class Interface_methods_example02 {
	public static void main(String[] args) {
		Fan fan = new Fan();
		Light light = new Light();
		Ac AirConditioner = new Ac();
		
		fan.turnOn();
		fan.Status();
		Device.Companyinfo();
		
		light.turnOn();
		light.Status();
		Device.Companyinfo();
		
		AirConditioner.turnOn();
		AirConditioner.Status();
		Device.Companyinfo();
	}
	

}
