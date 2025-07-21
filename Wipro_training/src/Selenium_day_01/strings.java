package Selenium_day_01;

public class strings {
    public static void main(String[] args) {

        String str = "Hello Java";

        // 🔠 Convert to Upper and Lower Case
        System.out.println("Uppercase: " + str.toUpperCase());   // HELLO JAVA
        System.out.println("Lowercase: " + str.toLowerCase());   // hello java

        // 🔍 Check if string contains a word
        System.out.println("Contains 'Java'? " + str.contains("Java")); // true

        // 🔢 Get length of string
        System.out.println("Length: " + str.length()); // 10

        // ✂️ Get substring
        System.out.println("Substring from index 6: " + str.substring(6)); // Java
        System.out.println("Substring from 0 to 5: " + str.substring(0, 5)); // Hello

        // 📌 Other Useful Methods:
        System.out.println("Starts with 'Hell'? " + str.startsWith("Hell")); // true
        System.out.println("Ends with 'a'? " + str.endsWith("a")); // false

        // 🆔 Equals vs EqualsIgnoreCase
        String name = "Ahad";
        System.out.println(name.equals("ahad")); // false
        System.out.println(name.equalsIgnoreCase("ahad")); // true

        // 🔄 Replace
        System.out.println("Replace Java with World: " + str.replace("Java", "World")); // Hello World

        // 🧹 Trim whitespace
        String messy = "   Clean me   ";
        System.out.println("Trimmed: '" + messy.trim() + "'"); // 'Clean me'
    }
}
