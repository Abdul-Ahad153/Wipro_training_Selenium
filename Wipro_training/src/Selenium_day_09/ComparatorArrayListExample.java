package Selenium_day_09;

import java.util.*;

public class ComparatorArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(90);
        numbers.add(40);
        numbers.add(10);

        // Comparator for ascending order
        Comparator<Integer> asc = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b; // a < b → -ve → a before b
            }
        };

        Collections.sort(numbers, asc);
        System.out.println("Ascending Order: " + numbers);
    }
}

