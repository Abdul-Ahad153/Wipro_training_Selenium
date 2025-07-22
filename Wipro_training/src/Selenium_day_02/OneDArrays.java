package Selenium_day_02;

public class OneDArrays {
    public static void main(String[] args) {
        // 1. Declare and initialize directly
        int[] directArray = {5, 15, 25, 35};

        System.out.println("Directly Initialized Array Elements:");
        for (int i = 0; i < directArray.length; i++) {
            System.out.println("Element at index " + i + ": " + directArray[i]);
        }

        // 2. Create array using 'new' keyword
        int[] marks = new int[4];
        marks[0] = 80;
        marks[1] = 85;
        marks[2] = 90;
        marks[3] = 95;

        System.out.println("\nArray Created Using 'new' Keyword:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }

        // 3. Sum of array elements
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("\nSum of marks: " + sum);

        // 4. Find maximum value in the array
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("Maximum mark: " + max);
        
        // 5. Find minimum value in the array
        int min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println("Minimum mark: " + min);
    }

}
