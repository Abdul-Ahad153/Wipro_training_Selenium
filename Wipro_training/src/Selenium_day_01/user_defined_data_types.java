package Selenium_day_01;
import java.util.Scanner ;

public class user_defined_data_types {
	public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter your name : ");
String name = sc.nextLine();
System.out.println("enter your age : ");
int age = sc.nextInt();
System.out.println("Name and age is : " + name);
System.out.println("Name and age is : " + age);
	}
}
