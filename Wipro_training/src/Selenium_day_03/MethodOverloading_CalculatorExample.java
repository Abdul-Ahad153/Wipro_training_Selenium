package Selenium_day_03;

class Calculator{
	int add(int a, int b) {
		return a + b;
	}
	int add(int a , int b , int c ) {
		return a +b + c;
	}
	double add(double a , double b) {
		return a + b;
	}
	int add(int a ) {
		return a * a ;
		
	}
}
public class MethodOverloading_CalculatorExample {
	public static void main(String[]args) {
		Calculator calc = new Calculator();
		
		System.out.println("Add 2 ints: " + calc.add(5, 10));
        System.out.println("Add 3 ints: " + calc.add(5, 10, 15));
        System.out.println("Add 2 doubles: " + calc.add(5.5, 2.2));
        System.out.println("Square of 7: " + calc.add(7));
	}

}
