package Selenium_day_01;

public class jump_statements {
    public static void main(String[] args) {

        System.out.println("Break Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Exit loop when i is 6
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nContinue Example:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue; // Skip iteration when j is 3
            }
            System.out.println("j = " + j);
        }

        System.out.println("\nReturn Example:");
        showMessage(); // Function that uses return
    }

    static void showMessage() {
        System.out.println("Inside showMessage()");
        return; // Exit from this method
        // Any code after return is unreachable
        // System.out.println("This won't print");
    }

}
