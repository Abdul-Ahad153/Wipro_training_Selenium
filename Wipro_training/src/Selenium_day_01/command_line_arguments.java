package Selenium_day_01;

public class command_line_arguments {
	
	    public static void main(String[] args) {
	        if (args.length < 2) {
	            System.out.println("Please provide two numbers.");
	            return;
	        }

	        try {
	            int a = Integer.parseInt(args[0]);
	            int b = Integer.parseInt(args[1]);
	            int sum = a + b;
	            System.out.println("Sum = " + sum);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input: " + e.getMessage());
	        }
	    }
	}

/* Command-line arguments are values you pass to your program when you run it from the terminal or an
 The args array holds the values as strings.
 parseInt is used to parse the text value into integer 
 How to Run This with Command Line Arguments: Using Eclipse:
Right-click on your file → Run As → Run Configurations.

On the left panel, choose your class name under Java Application.

On the right side, go to the Arguments tab.

In the Program Arguments box, type: 10 20 ( any input which u want to give but separate them with space )
  */
