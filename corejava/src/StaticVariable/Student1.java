package StaticVariable;

public class Student1 {
	private static int autoId=100;
	private int studId;
	private String studName;
	private double studAge;
	
	
	public Student1() {
		autoId++;
		studId=autoId;
		studId=autoId;
		studName="sanket";
		studAge=24;
	}
	public Student1(String studName, double studAge) {
		autoId++;
		studId=autoId;
		this.studName=studName;
		this.studAge=studAge;
	 
	
}
	public void printInfo() {
		System.out.println("Student id:"+studId);
		System.out.println("Student name:"+studName);
		System.out.println("Student Age:"+studAge);
	}
	}
