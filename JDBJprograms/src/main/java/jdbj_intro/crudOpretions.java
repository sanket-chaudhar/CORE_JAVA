package jdbj_intro;

import java.util.Scanner;

public class crudOpretions {

public static void main(String[] args) {
	System.out.println("Enter your choice :\n "+"1.insert\n" +"2.update\n" +"3.delete");
	Scanner s1 =new Scanner(System.in);
	int ans =s1.nextInt();
	
	OprectionsDeta op = new OprectionsDeta();
	if(ans==1) {
		op.insert();
		
	}else if (ans==2) {
		op.update();
	}else if (ans==3) {
		op.delete();
	}else {
		System.out.println("invalid number");
	}
	
	
}
    }

