package multi_threding;

public class Account {
private int accNo;
private String name;
private double balance;

public Account(int accNo,String name,double balance) {
	super();
	this.accNo=accNo;
	this.name=name;
	this.balance=balance;
}
public synchronized void withdraw(double amount)throws InterruptedException{
	
	System.out.println("balance before withdraw:"+ balance);
	balance=balance+amount;
	Thread.sleep(1000);
	System.out.println("balance after deposit"+balance);
	Thread.sleep(1000);
	
}
@Override
public String toString() {
	return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
}



}


