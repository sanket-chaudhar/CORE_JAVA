package Homework;

public class Employee {
private int empid;
private String empname;
private int basicsalary;
private int hra;
private int da;


	
	public Employee(int empid,String empname, int basicsalary,int hra,int da) {
		super();
		this.empid=empid;
		this.empname=empname;
		this.basicsalary=basicsalary;
		this.hra=hra;
		this.da=da;
	}
	public String CalculateSalary() {
		return empid+empname+basicsalary+hra+da;
	}
}


