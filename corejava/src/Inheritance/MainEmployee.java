package Inheritance;

public class MainEmployee {
public static void main (String[] args) {
	Employee e1=new Employee();
	e1.calculateSalary();
	
	
	Manager mgr=new Manager();
	int sal= mgr.getIncentive();
	int inc=mgr. calculateSalary();
	
	System.out.println("Salary of manager:"+(sal+inc));
}
}
