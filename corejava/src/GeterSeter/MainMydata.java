package GeterSeter;

public class MainMydata {
	public static void main(String[] args) {
		Mydata m1 = new Mydata();
		
		m1.setdate(18);
		int day= m1.getdate();
		
		m1.setmonth("december");
		String month=m1.getmonth();
		
		m1.setyear(2001);
		int year=m1.getyear();
		
		
		System.out.println("My Birthdate:");
		System.out.println("date: "+ day);
		System.out.println("Month: "+ month);
		System.out.println("Year " + year);
	}

}
