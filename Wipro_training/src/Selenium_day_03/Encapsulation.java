package Selenium_day_03;
class Student{
	private String name;
	private int marks ;
	void setName(String name) {
		this.name = name;
	}
	void setMarks(int marks) {
		if(marks >=0 && marks<=100) {
			this.marks = marks;
		}
		else {
			System.out.println("invalid marks");
		}
		
	}
	 String getName() {
		return name;
	}
	 int getMarks() {
		 return marks;
	 }
}
public class Encapsulation {
	public static void main (String[]args) {
		Student s = new Student();
		s.setName("Ahad");
		s.setMarks(90);
		
		System.out.println("Name of the Student is : " + s.getName());
		System.out.println("Marks of the Student is : " + s.getMarks());
		
	}

}
