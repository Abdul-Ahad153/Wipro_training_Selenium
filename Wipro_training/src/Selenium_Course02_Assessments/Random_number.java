package Selenium_Course02_Assessments;
import java.util.Random;

public class Random_number {
	public static void main(String[]args) {
		Random random = new Random();
		long min = 1000000000L;
		long max = 9999999999L;
		
		long randomNumber = (long)(Math.random()*9000000000L)+1000000000L;
		System.out.println("10 digit randomly generated number is : " + randomNumber);
	}

}
