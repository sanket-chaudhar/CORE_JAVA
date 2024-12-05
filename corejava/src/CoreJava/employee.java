package CoreJava;

public class employee {
	int EmpId;
	String EmpName;
	int EmpSalary;
	
	void detail() {
		EmpId=45;
		EmpName="ravi";
		EmpSalary=1500;
	}
	void print() {
		System.out.println("employee Id:"+EmpId);
		System.out.println("employee name:"+EmpName);
		System.out.println("employee salary:"+EmpSalary);
	}
	public static void main (String [] args) {
		employee s1 = new employee();
		
		s1.detail();
		s1.print();
		
	}
	

}
