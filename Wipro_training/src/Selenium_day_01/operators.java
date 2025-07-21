package Selenium_day_01;

public class operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Addition: " + (a + b));       // 13
        System.out.println("Subtraction: " + (a - b));    // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b));       // 3
        System.out.println("Modulo: " + (a % b));         // 1

        // 2. Assignment Operators
        int x = 5;
        x += 3; // x = x + 3
        System.out.println("x after += 3: " + x);         // 8

        // 3. Comparison Operators
        System.out.println("a == b: " + (a == b));        // false
        System.out.println("a > b: " + (a > b));          // true

        // 4. Logical Operators
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println("cond1 && cond2: " + (cond1 && cond2)); // false
        System.out.println("cond1 || cond2: " + (cond1 || cond2)); // true
        System.out.println("!cond1: " + (!cond1));                 // false

        // 5. Unary Operators
        int num = 5;
        System.out.println("num: " + num);       // 5
        System.out.println("++num: " + (++num)); // 6 (pre-increment)
        System.out.println("num--: " + (num--)); // 6 (post-decrement)
        System.out.println("num now: " + num);   // 5

        // 6. Ternary Operator
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary Result: " + result);  // Adult
    }
}

