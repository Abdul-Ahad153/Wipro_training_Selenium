package Selenium_Course01_Assessments;

public class TypeCasting {

    public static void main(String[] args) {

        // Implicit Type Casting (Widening Conversion)
        int intValue = 10;
        double doubleValue = intValue; // int is implicitly cast to double

        System.out.println("Implicit Type Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("double value (after casting): " + doubleValue);

        // Explicit Type Casting (Narrowing Conversion)
        double anotherDoubleValue = 15.75;
        int anotherIntValue = (int) anotherDoubleValue; // double is explicitly cast to int

        System.out.println("\nExplicit Type Casting:");
        System.out.println("double value: " + anotherDoubleValue);
        System.out.println("int value (after casting): " + anotherIntValue);
    }
}

