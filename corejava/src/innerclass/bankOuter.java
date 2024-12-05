package innerclass;

public class bankOuter {
private int acno;
private String accHolder;

public bankOuter()
{
	
	this.acno=538495;
	this.accHolder="sankrt chaudhar";
	
}
public void print() {
	System.out.println("Account details");
	System.out.println("Account no:"+acno);
	System.out.println("Account Holder:"+accHolder);
}

class LockerInner{
	private int Lockerno;
	private int Lockerpass;
	
	public LockerInner() {
		
		this.Lockerno=34;
		this.Lockerpass=6785;
	}
	public void printinfo() {
		
		System.out.println("Locker details:");
		System.out.println("Locker number"+ Lockerno);
		System.out.println("Locker Password:"+Lockerpass);
	}


}
}
