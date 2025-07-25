package Selenium_day_05;


interface A{
	void show();
}
interface B{
	void show();
}
interface C{
	void show();
}

class Multiple implements A,B,C{
	public void show() {
		System.out.println("showing the methods of A B C");

	}
}

public class Multiple_interfaces {
	public static void main(String[] args) {
		Multiple D = new Multiple();
		D.show();
	}

}
