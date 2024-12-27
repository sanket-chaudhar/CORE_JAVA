
package jdbj_intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class prapareStatment_updateData {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
        String username = "hr";
        String password = "hr";

        try {
            // Load and register driver 
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded successfully");

            // Establish the connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully");

            // Create a prepared statement
            String query = "UPDATE fruits SET fruit_Name = ? WHERE fruits_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);

            // Set parameters
            pstmt.setString(1, "grapes"); 
            pstmt.setInt(2, 1);

            // Execute the update
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Data updated successfully. Rows affected: " + rowsAffected);

           
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

