package Containment;

import ToStringMethod.Mydate;


public class Employee {
private int empId;
private String empName;
private double empsal;
private Mydate joiningDate;

public Employee() {
	empId=123;
	empName="sanket";
	empsal=3200;
	joiningDate=new Mydate();
}

public Employee(int empId, String empName,double empsal, Mydate joiningDate) {
	super();
	this.empId=empId;
	this.empName=empName;
	this.empsal=empsal;
	this.joiningDate=joiningDate;
	
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empsal=" + empsal + ", joiningDate=" + joiningDate
			+ "]";
}


}



