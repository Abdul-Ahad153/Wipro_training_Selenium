package Selenium_day_03;


//Abstract class: Blueprint
abstract class Employee {
 String name;
 int id;

 // Constructor
 Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Abstract method (must be implemented by child)
 abstract double calculateSalary();

 // Common method
 void showDetails() {
     System.out.println("Employee ID: " + id);
     System.out.println("Employee Name: " + name);
 }
}

//Full-time employee class
class FullTimeEmployee extends Employee {
 double salary;

 FullTimeEmployee(String name, int id, double salary) {
     super(name, id);
     this.salary = salary;
 }

 double calculateSalary() {
     return salary;
 }
}

//Part-time employee class
class PartTimeEmployee extends Employee {
 int hours;
 double rate;

 PartTimeEmployee(String name, int id, int hours, double rate) {
     super(name, id);
     this.hours = hours;
     this.rate = rate;
 }

 double calculateSalary() {
     return hours * rate;
 }
}

//Main class
public class Abstraction_Ecommerce {
 public static void main(String[] args) {
     // Polymorphic reference
     Employee e1 = new FullTimeEmployee("John", 101, 40000);
     Employee e2 = new PartTimeEmployee("Amit", 102, 100, 300);

     e1.showDetails();
     System.out.println("Salary: ₹" + e1.calculateSalary());

     System.out.println();

     e2.showDetails();
     System.out.println("Salary: ₹" + e2.calculateSalary());
 }
}
