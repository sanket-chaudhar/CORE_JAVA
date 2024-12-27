package jdbj_intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class prepareStement_RetriveData {
public static void main(String[] args) {
String url="jdbc:oracle:thin:localhost:1521:orcl";
	
	String username="hr";
	String password="hr";
	try {
		//load and register driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2 establish the conection....
		Connection con=DriverManager.getConnection(url,username,password);
		
		//create and [perpared statment,,,
		String query = "SELECT * FROM  fruits";
		PreparedStatement pstmt = con.prepareStatement(query);
		
		//execute the query and get the result set....
		ResultSet rs=pstmt.executeQuery();
		//5 print the header...
		System.out.println("fruits_id\tfruit_Name\tQuantity");
		System.out.println("====================================================");
		//result set and print data
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
