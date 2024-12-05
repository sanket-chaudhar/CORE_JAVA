package Containment;

import ToStringMethod.Mydate;

public class MainEmployee {
	public static void main(String[] arg) 
	{
		
		Employee emp= new Employee();
		System.out.println(emp);
		
		
		
		
		Mydate d=new Mydate(23,4,2001);
		Employee emp1=new Employee(234,"sanket" ,3200,d);
		
		System.out.println(emp1);
	}
	

}
