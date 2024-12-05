package odd_even;

import java.util.ArrayList;

public class OddEvenList {
public static void main(String[] args) {
	ArrayList<Integer> Number = new ArrayList<Integer>();
	
	for(int i=11; i<=30; i++) {
		Number.add(i);
	}
	
	System.out.println("numbers:"+Number);
	for(Integer number: Number)
	{
		if(number%2==0) {
			
			
			Number.add(number);
		}
	}
	System.out.println("even numbers:"+Number);
}
}
