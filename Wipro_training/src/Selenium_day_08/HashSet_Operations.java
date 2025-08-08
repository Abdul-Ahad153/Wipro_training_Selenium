package Selenium_day_08;

import java.util.HashSet;

public class HashSet_Operations {
    public static void main(String[] args) {
        // Create HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana"); // duplicate,this won't be added as it is set and set consists of unique items only

        // Display elements
        System.out.println("Fruits: " + fruits);

        // Check if element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Contains Grapes? " + fruits.contains("Grapes"));

        // Remove element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Size of set
        System.out.println("Set size: " + fruits.size());

        // Loop through elements
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Clear all elements
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}

