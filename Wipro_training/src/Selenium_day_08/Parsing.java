package Selenium_day_08;

public class Parsing {
	public static void main(String[] args) {
		String a = "77";
		String b = "89565";
		String c = "65.56";
		
		int intvalue = Integer.parseInt(a);
		double doublevalue = Double.parseDouble(b);
		float floatvalue = Float.parseFloat(c);
		
		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(floatvalue);



	}

}
