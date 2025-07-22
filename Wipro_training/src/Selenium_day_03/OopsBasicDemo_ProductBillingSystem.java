package Selenium_day_03;

//Class: SaleItem
class SaleItem {
 // Encapsulation: Private variables
 private String productName;
 private double price;
 private int quantity;

 // Constructor
  SaleItem(String productName, double price, int quantity) {
     this.productName = productName;
     this.price = price;
     this.quantity = quantity;
 }

 // Calculate total price for this item
  double getTotalPrice() {
     return price * quantity;
 }

 // Display item details
  void displayItem() {
     System.out.println(productName + "\t₹" + price + "\t" + quantity + "\t₹" + getTotalPrice());
 }
}

//✅ Main Class (Renamed as per your request)
public class OopsBasicDemo_ProductBillingSystem {
 public static void main(String[] args) {
     // Array of SaleItem objects
     SaleItem[] items = {
         new SaleItem("Laptop", 50000, 1),
         new SaleItem("Mouse", 500, 2),
         new SaleItem("Keyboard", 1000, 1)
     };

     double totalBill = 0;
     System.out.println("Product\tPrice\tQty\tTotal");
     System.out.println("----------------------------------");

     // Loop through items
     for (SaleItem item : items) {
         item.displayItem();
         totalBill += item.getTotalPrice();
     }

     System.out.println("----------------------------------");
     System.out.println("Grand Total: ₹" + totalBill);
 }
}

