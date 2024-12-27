package BatchInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertBatch {
public static void main(String[] args) {
	   String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
       String username = "hr";
       String password = "hr";

       Connection conn = null;
       Statement stmt = null;
       try {
    	   //established connection in database....
    	    conn = DriverManager.getConnection(url, username, password);
    	   
    	   //display auto commit mod for batch processing
    	   conn.setAutoCommit(false);
    	   
    	   //create statement object..
    	   stmt= conn.createStatement();
    	   
    	   //add multipal sql querys...
    	   stmt.addBatch("INSERT INTO fruits (fruits_id, fruit_Name, Quantity) VALUES (2, 'Apple', 14)");
    	   stmt.addBatch("INSERT INTO fruits (fruits_id, fruit_Name, Quantity) VALUES (3, 'pinapal', 15)");
    	   stmt.addBatch("INSERT INTO fruits (fruits_id, fruit_Name, Quantity) VALUES (4, 'banana', 16)");
    	  //execute the batch 
    	   int[]results = stmt.executeBatch();
    	   //commit the transactiuon
    	   conn.commit();
    	   
    	   //handaal result  print the number affacted row
    	   System.out.println("batch executed succefully.rows added:" +results.length);
    	   for (int result : results) {
    		   System.out.println(result);
    	   }
    	   	   
    	   }catch(SQLException e) {
    		   e.printStackTrace();
    	   }finally {
    		   if(stmt != null)
    			   if(conn != null)
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		   
    	   }
    	   		
    	   
       }
    	   
    	   
       }

