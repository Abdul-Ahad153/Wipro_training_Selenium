package Selenium_day_11;

import java.sql.*;

public class Jdbc2 {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/selenium_jdbc";
        String userName = "root";  // Change if you have a different username
        String pwd = "";           // Change if you have a MySQL password

        try {
            // Load MySQL Driver (modern MySQL 8+ driver class)
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL driver not found");
            e.printStackTrace();
            return;
        }

        try (Connection con = DriverManager.getConnection(url, userName, pwd);
             Statement st = con.createStatement()) {

            // Insert into your existing table 'sample'
            String insertQuery = "INSERT INTO sample(name, email) VALUES(?, ?)";
            try (PreparedStatement ps = con.prepareStatement(insertQuery)) {
                ps.setString(1, "Laddagiri");
                ps.setString(2, "Laddagiri@example.com");
                ps.addBatch();

                ps.setString(1, "Abdul");
                ps.setString(2, "Abdul@example.com");
                ps.addBatch();

                int[] arr = ps.executeBatch();
                System.out.printf("Inserted rows: %d%n",
                        (int) java.util.stream.IntStream.of(arr).filter(c -> c > 0).count());
            }

            // Select and display all records from 'sample'
            String query = "SELECT * FROM sample";
            try (ResultSet rs = st.executeQuery(query)) {
                while (rs.next()) {
                    int id = rs.getInt(1);       // id column
                    String name = rs.getString(2); // name column
                    String email = rs.getString(3); // email column
                    System.out.println("ID: " + id + " Name: " + name + " Email: " + email);
                }
            }

        } catch (SQLException e) {
            System.out.println("Data operation failed");
            e.printStackTrace();
        }
    }
}

