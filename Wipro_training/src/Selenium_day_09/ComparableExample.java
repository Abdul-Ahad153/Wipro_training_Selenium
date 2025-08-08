package Selenium_day_09;

import java.util.*;

class Player implements Comparable<Player> {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Player other) {
        return this.score - other.score; // Ascending sort
    }

    public String toString() {
        return name + " (" + score + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Dhoni", 95));
        players.add(new Player("Kohli", 88));
        players.add(new Player("Gill", 91));

        Collections.sort(players); 

        System.out.println("Sorted by score:");
        for (Player p : players) {
            System.out.println(p);
        }
    }
}
