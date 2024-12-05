package Externlization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Employee implements Externalizable {
	  
		 private int empid;
		 private String empName;
		 private double empSal;
		 public Employee() {
		 	super();
		 	
		 	
		 }
		 public Employee(int empid, String empName,double empSal) {
		 	super();
		 	this.empid=empid;
		 	this.empName=empName;
		 	this.empSal=empSal;
		 	
		 }
		 @Override
		 public String toString() {
		 	return "Employee [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + "]";
		 }
		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
			// TODO Auto-generated method stub
			out.writeObject(empName);
			out.writeDouble(empSal);
		}
		@Override
		public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
			// TODO Auto-generated method stub
			empName=(String)in.readObject();
			empSal=in.readDouble();
		}

		 }


