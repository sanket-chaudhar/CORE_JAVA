package innerclass;

public class Mainapp {
	public static void main(String[] args) {
	
		Outer o =new Outer();
		o.outerMethod();
		Outer.Inner in=o.new Inner();
		in.InnerMethod();
	} 

}
