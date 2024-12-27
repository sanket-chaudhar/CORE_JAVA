package jdbj_intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrive_data {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:localhost:1521:orcl";
		String username="hr";
		String password="hr";
		try {
			//step 1: load and register the driver.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("Driver loaded sucessfully");
			
			
			//step 2:Estsblished the connection.
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Established the connection successfully!!!");
		
		//step 3:create statement platform....
		Statement stmt=con.createStatement();
		//step 4:Execute sql Query..
		String query="select * from employees";
		//step 5:get the result
		ResultSet rs=stmt.executeQuery(query);
		//step 6: load the result set...
		while(rs.next()) {
			System.out.println("Employee ID: "+rs.getInt(1));
			System.out.println("Employee Name" +rs.getString(2));
		
		}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
