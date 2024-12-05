package Polymorphism;

public class MainEmployee {
	public static void main(String[] argu) {
		
		
		Manager mgr=new Manager(32000,5600,345,7800);
		int sal=mgr.calculateSalary();
		
		System.out.println("Salary of manager:"+sal);
	}

}
