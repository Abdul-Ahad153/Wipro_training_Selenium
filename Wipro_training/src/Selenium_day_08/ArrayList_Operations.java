package Selenium_day_08;

import java.util.ArrayList;

public class ArrayList_Operations {
    public static void main(String[] args) {
        
        // Create an ArrayList
        ArrayList<String> items = new ArrayList<String>();

        // Add elements
        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Pencil");
        System.out.println("Items after adding: " + items);

        // Get an element at index
        System.out.println("Item at index 1: " + items.get(1));

        // Check if item exists
        System.out.println("Contains 'Pencil'? " + items.contains("Pencil"));
        System.out.println("Contains 'Marker'? " + items.contains("Marker"));

        // Remove an item by value
        items.remove("Eraser");
        System.out.println("After removing 'Eraser': " + items);

        // Remove by index
        items.remove(0); // removes "Pen"
        System.out.println("After removing index 0: " + items);

        // Add another item
        items.add("Marker");
        System.out.println("After adding 'Marker': " + items);

        // Loop through elements
        System.out.println("Displaying all items:");
        for (String item : items) {
            System.out.println("- " + item);
        }

        // Display total size
        System.out.println("Total number of items: " + items.size());

        // Clear all elements
        items.clear();
        System.out.println("After clearing the list: " + items);
    }
}
