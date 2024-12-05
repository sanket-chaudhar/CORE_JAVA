package Polymorphism;

public class Employee {
private int basicsal;
private int hra;
private int da;


public int calculateSalary()
{
	return basicsal+hra+da;
			}


public Employee(int basicsal, int hra, int da) {
	super();
	this.basicsal = basicsal;
	this.hra = hra;
	this.da = da;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [basicsal=" + basicsal + ", hra=" + hra + ", da=" + da + "]";
}



	

}
