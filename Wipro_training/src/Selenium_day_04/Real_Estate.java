package Selenium_day_04;
import java.util.Scanner;

// Abstract class Property
abstract class Property {
    abstract void housetype();
    abstract void area();

    void monthly_rent(int rent) {
        System.out.println("The monthly rent is: " + rent);
    }

    void monthly_expenses(int expenses) {
        System.out.println("The monthly expenses are: " + expenses);
    }

    void monthly_ebill(int ebill) {
        System.out.println("The monthly electricity bill is: " + ebill);
    }

    static int getRentFromUser(String propertyName) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rent of the " + propertyName + " (RS): ");
        return sc.nextInt();
    }

    static int getExpensesFromUser(String propertyName) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Expenses of the " + propertyName + " (RS): ");
        return sc.nextInt();
    }

    static int getElectricityBillFromUser(String propertyName) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Electricity Bill of the " + propertyName + " (RS): ");
        return sc.nextInt();
    }

    int getTotalMonthlyExpenses(int rent, int expenses, int eBill) {
        return rent + expenses + eBill;
    }
}

// Villa class
class Villa extends Property {
    void housetype() {
        System.out.println("House Type: Individual Villa");
    }

    void area() {
        System.out.println("Location: Banjara Hills, Hyderabad");
    }

    int getRent() {
        return getRentFromUser("Villa");
    }

    int getExpenses() {
        return getExpensesFromUser("Villa");
    }

    int getEbill() {
        return getElectricityBillFromUser("Villa");
    }
}

// Apartments class
class Appartments extends Property {
    void housetype() {
        System.out.println("House Type: 3 BHK Flat");
    }

    void area() {
        System.out.println("Location: Gachibowli, Hyderabad");
    }

    int getRent() {
        return getRentFromUser("Apartment");
    }

    int getExpenses() {
        return getExpensesFromUser("Apartment");
    }

    int getEbill() {
        return getElectricityBillFromUser("Apartment");
    }
}

// Main class
public class Real_Estate {
    public static void main(String[] args) {
        Villa villa = new Villa();
        Appartments appartments = new Appartments();

        System.out.println(" VILLA DETAILS ");
        villa.housetype();
        villa.area();

        int villaRent = villa.getRent();
        int villaEbill = villa.getEbill();
        int villaExpenses = villa.getExpenses();

        villa.monthly_rent(villaRent);
        villa.monthly_ebill(villaEbill);
        villa.monthly_expenses(villaExpenses);

        int villaTotal = villa.getTotalMonthlyExpenses(villaRent, villaExpenses, villaEbill);
        System.out.println("Total Monthly Expense for Villa: " + villaTotal);

        System.out.println("\n--- APARTMENT DETAILS ---");
        appartments.housetype();
        appartments.area();

        int aptRent = appartments.getRent();
        int aptEbill = appartments.getEbill();
        int aptExpenses = appartments.getExpenses();

        appartments.monthly_rent(aptRent);
        appartments.monthly_ebill(aptEbill);
        appartments.monthly_expenses(aptExpenses);

        int aptTotal = appartments.getTotalMonthlyExpenses(aptRent, aptExpenses, aptEbill);
        System.out.println("Total Monthly Expense for Apartment: " + aptTotal);
    }
}

