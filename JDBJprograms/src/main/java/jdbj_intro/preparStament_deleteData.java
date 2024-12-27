package jdbj_intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class preparStament_deleteData {
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
         String query = "DELETE FROM fruits WHERE  fruits_id = ?";
         PreparedStatement pstmt = con.prepareStatement(query);

         // Set parameters
         
         pstmt.setInt(1, 23);

         // Execute the update
         int rowsAffected = pstmt.executeUpdate();
         System.out.println("Data deleted  successfully. Rows affected: " );

      //close the connection
         pstmt.close();
         con.close();
         
         
     } catch (Exception e) {
         e.printStackTrace();
     }
 
}
}
