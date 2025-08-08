package Selenium_day_08;

import java.util.LinkedList;

public class LinkedList_Operations {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> tasks = new LinkedList<>();

        // Add elements
        tasks.add("Wake up");
        tasks.add("Brush teeth");
        tasks.add("Go to gym");
        System.out.println("Tasks: " + tasks);

        // Add at first and last
        tasks.addFirst("Meditate");
        tasks.addLast("Breakfast");
        System.out.println("After adding at first & last: " + tasks);

        // Access elements
        System.out.println("First task: " + tasks.getFirst());
        System.out.println("Last task: " + tasks.getLast());

        // Remove elements
        tasks.remove("Brush teeth");
        tasks.removeFirst();
        tasks.removeLast();
        System.out.println("After removals: " + tasks);

        // Check if contains an item
        System.out.println("Contains 'Go to gym'? " + tasks.contains("Go to gym"));

        // Size of the list
        System.out.println("Total tasks: " + tasks.size());

        // Iterate through list
        System.out.println("Today's To-Do:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }

        // Clear the list
        tasks.clear();
        System.out.println("After clearing: " + tasks);
    }
}
