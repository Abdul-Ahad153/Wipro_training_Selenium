package Selenium_day_03;

//Interface: Blueprint for all payment types
interface PaymentMethod {
 void makePayment(double amount);
}

//UPI Payment Implementation
class Upi implements PaymentMethod {
 public void makePayment(double amount) {
     System.out.println("UPI Payment of ₹" + amount + " successful.");
 }
}

//Credit Card Payment Implementation
class CreditCard implements PaymentMethod {
 public void makePayment(double amount) {
     System.out.println("Credit Card payment of ₹" + amount + " successful.");
 }
}

//Cash on Delivery Implementation
class COD implements PaymentMethod {
 public void makePayment(double amount) {
     System.out.println("You will pay ₹" + amount + " at the time of delivery.");
 }
}

//Main Class
public class Interface_Ecommerce {
 public static void main(String[] args) {
     // Interface reference used for dynamic payment method
     PaymentMethod payment;

     // UPI payment
     payment = new Upi();
     payment.makePayment(1000);

     // Credit Card payment
     payment = new CreditCard();
     payment.makePayment(2500);

     // Cash on Delivery
     payment = new COD();
     payment.makePayment(1800);
 }
}
