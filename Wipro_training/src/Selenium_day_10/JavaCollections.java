package Selenium_day_10;


import java.util.ArrayList;

public class JavaCollections {

    // Department class should be static to be accessed from static main
    public static class Department {

        private String name;
        private double sales;
        private double expenses;

        public Department(String name, double sales, double expenses) {
            this.name = name;
            this.sales = sales;
            this.expenses = expenses;
        }

        public double getProfit() {
            return sales - expenses;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        ArrayList<Department> depart = new ArrayList<>();

        depart.add(new Department("Sales", 400000, 150000));
        depart.add(new Department("Marketing", 300000, 150000));
        depart.add(new Department("Research", 200000, 150000));
        
        for (Department d : depart) {
            System.out.println("Department: " + d.getName());
            System.out.println("Profit: " + d.getProfit());
        }
        depart.sort((d1,d2) -> Double.compare(d1.getProfit(), d2.getProfit()));

    }
}
