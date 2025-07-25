package Selenium_day_05;

interface Add {
	void addition(int a, int b);	
}
interface Sub {
	void subtraction(int a , int b);
}
interface Mulpy {
	void multiplication(int a , int b);
}

class Calculator implements Add , Sub , Mulpy {
	public void addition (int a , int b) {
		System.out.println("sum is : " + (a + b));

	}
	public void subtraction (int a , int b) {
		System.out.println("subtraction is : " + (a - b)); 

	}
	public void multiplication (int a , int b) {
		System.out.println("multiplication is : " + (a * b));

	}
	
}
public class Multiple_interfaces_different_methods {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.addition(8, 5);
		calculator.subtraction(8, 5);
		calculator.multiplication(8, 5);
		
	}

}
