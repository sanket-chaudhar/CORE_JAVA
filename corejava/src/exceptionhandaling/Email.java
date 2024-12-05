package exceptionhandaling;

import java.util.Scanner;

public class Email {
public static void main(String[] args) {
	boolean exit=true;
	Scanner sc=new Scanner(System.in);
	
	do {
		System.out.println("Enter your Email");
		String email=sc.next();
		
		if(email.contains("@")&&email.contains(".com")) {
			System.out.println("your Email"+email);
			exit=false;
			
		}else {
			try {
				throw new InvalidEmailException();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}while (exit==true);
	
}
}
