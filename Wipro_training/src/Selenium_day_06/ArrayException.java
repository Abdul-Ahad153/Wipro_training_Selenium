package Selenium_day_06;

public class ArrayException {
    public static void main(String[] args) {
        int[] marks = {90, 85, 76, 88, 92};

        try {
            // Trying to access 6th element (index 5)
            System.out.println("Accessing 6th element: " + marks[5]);
        } catch (Exception e) {   
            System.out.println("Exception: You tried to access an index that doesn't exist.");
        } finally {
            System.out.println("Execution of try-catch-finally is completed.");
        }
    }
}

