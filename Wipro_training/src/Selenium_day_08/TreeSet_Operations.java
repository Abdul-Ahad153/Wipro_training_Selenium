package Selenium_day_08;

import java.util.TreeSet;

public class TreeSet_Operations {
    public static void main(String[] args) {
    	// the difference between a hash set and tree set is , in tree set the elements are always sorted 
    	
        // Create TreeSet
        TreeSet<Integer> scores = new TreeSet<>();

        // Add elements
        scores.add(88);
        scores.add(95);
        scores.add(75);
        scores.add(92);
        scores.add(88); // duplicate, won't be added because the set always contains unique values

        // Display sorted set
        System.out.println("Scores (sorted): " + scores);

        // Remove a score
        scores.remove(75);
        System.out.println("After removal: " + scores);

        // Check if a score exists
        System.out.println("Has 95? " + scores.contains(95));
        System.out.println("Has 100? " + scores.contains(100));

        // First and last elements
        System.out.println("Lowest score: " + scores.first());
        System.out.println("Highest score: " + scores.last());

        // Size of set
        System.out.println("Total scores: " + scores.size());

        // Loop through scores
        System.out.println("All scores:");
        for (int score : scores) {
            System.out.println(score);
        }

        // Clear set
        scores.clear();
        System.out.println("After clearing: " + scores);
    }
}
