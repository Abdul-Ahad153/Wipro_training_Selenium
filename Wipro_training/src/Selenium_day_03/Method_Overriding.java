package Selenium_day_03;

//Parent Class
class Bank {
 double getInterestRate() {
     return 3.0;  // Default interest
 }
}

//Child Class 1
class SBI extends Bank {
 @Override
 double getInterestRate() {
     return 5.0;  // Overridden
 }
}

//Child Class 2
class HDFC extends Bank {
 @Override
 double getInterestRate() {
     return 6.5;  // Overridden
 }
}

public class Method_Overriding {
 public static void main(String[] args) {
     Bank b = new Bank();
     SBI s = new SBI();
     HDFC h = new HDFC();

     System.out.println("Bank interest: " + b.getInterestRate() + "%");
     System.out.println("SBI interest: " + s.getInterestRate() + "%");
     System.out.println("HDFC interest: " + h.getInterestRate() + "%");
 }
}

