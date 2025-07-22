package Selenium_day_03;
//BankAccount.java (Main class representing the bank account)
//BankAccount.java (Main class representing the bank account)
class BankAccount {
 // Private data members (Encapsulation)
 private String name;
 private double balance;

 // Constructor
 public BankAccount(String name, double balance) {
     this.name = name;
     this.balance = balance;
 }

 // Deposit method
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
 }

 // Withdraw method
 public void withdraw(double amount) {
     if (amount > balance) {
         System.out.println("Insufficient balance!");
     } else {
         balance -= amount;
         System.out.println("Withdrawn ₹" + amount + ". Remaining Balance: ₹" + balance);
     }
 }

 // Show account details
 public void showDetails() {
     System.out.println("\n--- Account Summary ---");
     System.out.println("Account Holder: " + name);
     System.out.println("Current Balance: ₹" + balance);
 }
}
//BankApp.java (Main class with main method)
public class Bank_Project {
 public static void main(String[] args) {
     // Creating an object (account)
     BankAccount acc = new BankAccount("Abdul Ahad", 1000);

     acc.deposit(200);      // Deposit money
     acc.withdraw(150);     // Withdraw money
     acc.showDetails();     // Show account details
 }
}

