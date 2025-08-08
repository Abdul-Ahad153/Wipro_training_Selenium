package Selenium_day_08;

import java.util.HashMap;

public class HashMap_Operations {
    public static void main(String[] args) {
        // Create HashMap
        HashMap<String, Integer> marks = new HashMap<>();

        // Add entries (put)
        marks.put("Ahad", 90);
        marks.put("Zaid", 85);
        marks.put("Sana", 92);
        marks.put("Ali", 78);
        System.out.println("Initial marks: " + marks);

        // Access value using key
        System.out.println("Marks of Zaid: " + marks.get("Zaid"));

        // Check if key exists
        System.out.println("Has Sana? " + marks.containsKey("Sana"));
        System.out.println("Has Rehan? " + marks.containsKey("Rehan"));

        // Check if value exists
        System.out.println("Has 85 marks? " + marks.containsValue(85));

        // Remove entry
        marks.remove("Ali");
        System.out.println("After removing Ali: " + marks);

        // Size of the map
        System.out.println("Total students: " + marks.size());

        // Loop through keys and values
        System.out.println("All student marks:");
        for (String name : marks.keySet()) {
            System.out.println(name + " => " + marks.get(name));
        }

        // Clear all entries
        marks.clear();
        System.out.println("After clearing: " + marks);
    }
}
