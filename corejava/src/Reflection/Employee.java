package Reflection;

public class Employee implements Comparable<Employee>{
@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}

public int empid;
public String empname;
public double empsalary;

public Employee(int empid,String empname, double empsalary) {
	super();
	this.empid=empid;
	this.empname=empname;
	this.empsalary=empsalary;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public double getEmpsalary() {
	return empsalary;
}

public void setEmpsalary(double empsalary) {
	this.empsalary = empsalary;
}

@Override


public int compareTo(Employee o) {
	if (this.empsalary>o.empsalary) {
		return 1;
		
	}else if (this.empsalary<o.empsalary){
		return -1;
		
	}else {
		return 0;
	}
	
}

//public int compareTo(Employee o) {
//	
//	if (this.empid>o.empid) {
//		return 1;
//		
//	}else if (this.empid<o.empid) {
//		return -1;
//	}else {
//return 
//		
//		
//		
//		0;
//	}
}


//}






