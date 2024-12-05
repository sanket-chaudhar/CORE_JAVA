package exceptionhandaling;

import java.util.Scanner;

public class Voting {
public static void main(String[] args) {
	boolean exit =true;
	
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter your age");
	int age=sc.nextInt();
if (age>=18) {
	System.out.println("Vote here!!!"
			+"\n1 bjp"
			+"\n2 Shiv shena"
			+"\n3 ncp");
	
}else {
	throw new InvalidAgeException();
}
	}
}
