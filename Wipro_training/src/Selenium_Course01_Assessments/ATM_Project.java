package Selenium_Course01_Assessments;

	import java.util.Scanner;

	// Encapsulated BankAccount class
	class BankAccount {
	    private double balance;

	    // Constructor
	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    // Getter for balance
	    public double getBalance() {
	        return balance;
	    }

	    // Deposit method
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("₹" + amount + " deposited successfully.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Withdraw method
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("₹" + amount + " withdrawn successfully.");
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }
	}

	// Main class
	public class ATM_Project {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        BankAccount account = new BankAccount(1000); // Initial balance ₹1000

	        while (true) {
	            System.out.println("\n--- ATM MENU ---");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Current Balance: ₹" + account.getBalance());
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ₹");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ₹");
	                    double withdrawAmount = scanner.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please choose between 1 to 4.");
	            }
	        }
	    }
	}


