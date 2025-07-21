package Selenium_day_01;

public class comparing_strings {
	public static void main(String[] args) {
        // String literals (same object in pool)
        String str1 = "Ahad";
        String str2 = "Ahad";

        // New object (different memory location)
        String str3 = new String("Ahad");
        String str4 = "ahad";  // lowercase version

        // == Operator (reference comparison)
        System.out.println("== Comparison:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false

        // .equals() method (content comparison)
        System.out.println("\n.equals() Comparison:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false

        // .equalsIgnoreCase() method
        System.out.println("\n.equalsIgnoreCase() Comparison:");
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

        // .compareTo() method
        String s1 = "Apple";
        String s2 = "Banana";
        String s3 = "Apple";

        System.out.println("\n.compareTo() Comparison:");
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); // negative (Apple < Banana)
        System.out.println("s2.compareTo(s1): " + s2.compareTo(s1)); // positive (Banana > Apple)
        System.out.println("s1.compareTo(s3): " + s1.compareTo(s3)); // 0 (equal)
    }
}
	    


