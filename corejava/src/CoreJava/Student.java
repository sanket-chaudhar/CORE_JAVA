package CoreJava;

public class Student {
	int StudId;
	String StudName;
	double StudMark;
	
	void detail() {
		StudId= 105;
		StudName="sanket";
		StudMark= 90;
	}
	void print() {
		System.out.println (" Student id:"+StudId);
		System.out.println ("Student name:"+StudName);
		System.out.println("Student mark"+StudMark);
	}
	public static void main (String[] args) {
		Student s1 = new Student();
		s1.detail();
		s1.print();
	}

	

}
