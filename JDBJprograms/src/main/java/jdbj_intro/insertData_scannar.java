package jdbj_intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class insertData_scannar {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:localhost:1521:orcl";
		String username="hr";
		String password="hr";
		try  {
		// load and register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded sucessfully");
			
			//step 2:Estsblished the connection.
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Established the connection successfully!!!");
	//create statement platform..
			Statement stmt=con.createStatement();
			
			//execute sql query...
			String query = "INSERT INTO fruits (fruits_id, fruit_Name, Quantity) VALUES (" + id + ", '" + name + "', '" + quantity + "')";

			stmt.executeUpdate(query);
			System.out.println("data added sucessfully !!!!!");
		}catch(Exception e) {
			// auto genrated catch block!!!
			e.printStackTrace();
		}
		
		
	}
}
