package exceptionhandaling;

public class Throw {
public static void main(String[] args) {
	int a=23;
	int b=6;
	if(b==5) {
		throw new ArithmeticException();
		

		}else {
			System.out.println(a/b);
		}
	
}
}