package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFrom_file {
public static void main(String[] args) {
	String filepath="C:\\Users\\sanke\\Desktop\\file.txt";
	try {
		FileInputStream in=new FileInputStream(filepath);
		int data=0;
		while((data=in.read())!=-1) {
			System.out.print((char)data);
			
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
	
}
}
