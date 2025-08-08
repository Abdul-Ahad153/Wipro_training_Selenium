package Selenium_day_11;
import java.sql.*;

public class Jdbc {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/selenium_jdbc";
        String userName = "root";
        String pwd = "";
        String query = "select * from sample";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, userName, pwd);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt(1);        // id column
            String name = rs.getString(2); // name column
            String email = rs.getString(3); // email column
            System.out.println("ID: " + id + " Name: " + name + " Email: " + email);
        }

        rs.close();
        st.close();
        con.close();
    }
}
