package CoreJava;

public class mydata {
	private int date, month,year;
	
	void detail () {
		date=18;
		month=12;
		year=2001;
		
	}
	void show() {
		System.out.println("Birthdate is: "+date+"/"+month+"/" +year);
	}
	public static void main(String[] args) {
		mydata m1=new mydata();
		m1.detail();
		m1.show();
	}
	
	
	

}
