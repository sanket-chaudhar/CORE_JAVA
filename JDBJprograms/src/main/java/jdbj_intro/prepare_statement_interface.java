package jdbj_intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class prepare_statement_interface {
public static void main(String[] args) {
	String url="jdbc:oracle:thin:localhost:1521:orcl";
	
	String username="hr";
	String password="hr";
	try {
		
		Connection con = DriverManager.getConnection(url,username,password);
		String query="INSERT INTO fruits(fruits_id,fruit_Name,Quantity) VALUES (?,?,?)";
		//create prepred statement
		PreparedStatement pstmt =con.prepareStatement(query);
		//set parameters
		
		pstmt.setInt(1, 23);
		pstmt.setString(2,"apple");
		pstmt.setDouble(3, 45);
		//execute the query
		
		int count=pstmt.executeUpdate();
		
		System.out.println(count+"data added sucessfully!!!");
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
