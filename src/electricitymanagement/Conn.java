package electricitymanagement;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    
    Conn() {
        try {
            // Establishing the database connection
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "1234@1234"); // replace the password according to your account
            s = c.createStatement();
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            // Handling SQL exceptions
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // Handling other exceptions
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
