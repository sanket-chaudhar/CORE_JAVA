package GeterSeter;

public class MainEmployee {
public static void main(String [] args) {
	Employee e1 =new Employee();
	e1.setEmployeeName("sanket");
	String Name=e1.getemployeeName();
	
	e1.setEmployeeId(1);
	int Id=e1.getEmployeeId();
	
	e1.setEmployeeAge(23);
	int Age=e1.getEmployeeAge();
	
	System.out.println("Employee Name:"+Name );
	System.out.println("Employee Id :"+Id);
	System.out.println("Employee Age:"+Age);
}

}
