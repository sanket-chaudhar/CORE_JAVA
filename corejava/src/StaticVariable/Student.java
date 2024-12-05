package StaticVariable;

public class Student {
private int count;
private int studId;
private String studName;
private double studAge;


public Student() {
	count++;
	studId=543;
	studName="sanket";
	studAge=23;
	
}
public Student(int studId,String studName,double studAge) {
	count++;
	this.studId=studId;
	this.studName=studName;
	this.studAge=studAge;
	
}
public int getCount() {
	return count;
}
	



}
