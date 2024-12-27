package jdbj_intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OprectionsDeta {

	public void insert() {
		// Load and register driver 
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 
	        System.out.println("Driver loaded successfully");
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl");
	        System.out.println("connection established");
		Statement stmt= con.createStatement();
		String query = "insert into fruits (fruits_id,fruit_Name,Quantity) values(1,'Apple',12)";
		stmt.executeUpdate(query);
		System.out.println("data added sucessfully...");
        
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        
		
	}

	public void update() {
		// TODO Auto-generated method stub
		// Load and register driver 
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 
	        System.out.println("Driver loaded successfully");
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl");
	        System.out.println("connection established");
		Statement stmt= con.createStatement();
		String query = "UPDATE fruits SET fruit_name = 'banana' WHERE fruits_id = 1";
		stmt.executeUpdate(query);
		System.out.println("data Updated sucessfully...");
        
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}

	public void delete() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// Load and register driver 
		        try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					 
			        System.out.println("Driver loaded successfully");
			        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl");
			        System.out.println("connection established");
				Statement stmt= con.createStatement();
				String query = "DELETE FROM fruits WHERE  fruits_id = 2";
				stmt.executeUpdate(query);
				System.out.println("data delete sucessfully...");
		        
		        }catch(Exception e) {
		        	e.printStackTrace();
		        }
	}

}
