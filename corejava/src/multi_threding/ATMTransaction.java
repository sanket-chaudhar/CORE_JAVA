package multi_threding;

public class ATMTransaction extends  Thread{
	Account ac;
	double amount;
	String flag;
	
	public ATMTransaction(Account ac,double amount, String flag) {
		super();
		this.ac=ac;
		this.amount=amount;
		this.flag=flag;
		
	}
	
	@Override
	public void run() {
		try {
		if(flag.equals("withdraw"))
				ac.withdraw(amount);
		
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
		}


