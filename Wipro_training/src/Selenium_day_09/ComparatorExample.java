package Selenium_day_09;

import java.util.*;

class Movie {
    String title;
    double rating;

    Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String toString() {
        return title + " (" + rating + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Your name", 8.4));
        movies.add(new Movie("Mugen Train", 8.2));
        movies.add(new Movie("Silent Voice", 8.1));

        Comparator<Movie> byRatingDesc = new Comparator<Movie>() {
            public int compare(Movie m1, Movie m2) {
                return Double.compare(m2.rating, m1.rating); // Descending
            }
        };

        Collections.sort(movies, byRatingDesc);

        System.out.println("Sorted by Rating (High to Low):");
        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}
