package Selenium_day_01;

public class conditional_statements {
	    public static void main(String[] args) {
	        int marks = 85;

	        // if statement
	        if (marks >= 33) {
	            System.out.println("You passed the exam");
	        }

	        // if-else statement
	        if (marks >= 90) {
	            System.out.println("Excellent score!");
	        } else {
	            System.out.println("Good attempt!");
	        }

	        // if-else-if ladder
	        if (marks >= 90) {
	            System.out.println("Grade: A+");
	        } else if (marks >= 75) {
	            System.out.println("Grade: A");
	        } else if (marks >= 60) {
	            System.out.println("Grade: B");
	        } else if (marks >= 50) {
	            System.out.println("Grade: C");
	        } else {
	            System.out.println("Grade: Fail");
	        }
	    }
	}


