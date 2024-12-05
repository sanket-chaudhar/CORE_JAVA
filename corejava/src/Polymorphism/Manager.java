package Polymorphism;

public class Manager  extends Employee {

	private int incentive;
	
	public Manager(int basicsal,int hra,int da,int incentive) {
		super(basicsal,hra,da);
		this.incentive=incentive;
	}

	@Override
	public String toString() {
		return "Manager [incentive=" + incentive + "]";
		
	} 
	
	
}
