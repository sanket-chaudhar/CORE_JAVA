package GeterSeter;

public class Employee {
	private String EmployeeName;
	private int EmployeeId;
	private int EmployeeAge;
	
	public void setEmployeeName(String Name) {
		this.EmployeeName=Name;
	}
	public String getemployeeName() {
		return EmployeeName;
	}
	
    public void setEmployeeId(int Id) {
    	this.EmployeeId=Id;
    }
    public int getEmployeeId() {
    	return EmployeeId;
    }
    
    public void setEmployeeAge(int Age) {
    	this.EmployeeAge=Age;
    	
    }
    public int getEmployeeAge () {
    	return EmployeeAge;
    	
    }
    
    
}
