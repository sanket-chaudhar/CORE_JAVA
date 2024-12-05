package Inheritance;

public class Employee {
private int basicSalary;
private int hra;
private int da;


public Employee() {
	basicSalary=23000;
	hra=5434;
	da=334;
	
}
public int calculateSalary() {
	return basicSalary+hra+da;
	
}

}
