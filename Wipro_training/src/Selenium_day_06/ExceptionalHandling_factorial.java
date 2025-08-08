package Selenium_day_06;

import java.util.Scanner;

public class ExceptionalHandling_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number to calculate factorial: ");
            int num = sc.nextInt();

            if (num < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            }

            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + num + " is: " + fact);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}

