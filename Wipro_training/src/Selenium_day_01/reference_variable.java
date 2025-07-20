package Selenium_day_01;

class Student{
	String name ;
	int age;
}
public class reference_variable {
public static void main (String[] args) {
	Student s1 = new Student();
	s1.name = "Ahad";
	s1.age = 23;
	
	System.out.println("student name is : " + s1.name);
	System.out.println("student age is : " + s1.age);
	
	Student s2 = s1 ;
	s2.name = "abdul";
//	s2.age = 22;
	System.out.println("updated name of s2 is : " + s1.name);
}
}

/* 
A reference variable refers to an object created in memory (heap). 
It does not hold the actual object, but it holds the memory address (reference) pointing to the object.

s1 and s2 are reference variables.
Both can point to the same object, and any change through one will affect the other.
All objects, arrays, and classes in Java use reference variables.
*/