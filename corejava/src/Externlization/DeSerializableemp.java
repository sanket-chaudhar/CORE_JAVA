package Externlization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableemp {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\sanke\\Desktopfile.txet";
		
		try {
			FileInputStream in = new FileInputStream(filePath);
			ObjectInputStream obin = new ObjectInputStream(in);
			Employee emp = (Employee) obin.readObject();
			System.out.println(emp);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
