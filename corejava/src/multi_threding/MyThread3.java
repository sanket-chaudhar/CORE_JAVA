package multi_threding;

public class MyThread3 extends Thread {
String []arr= {"java","is","object","orianted","programing","langauge"};

public MyThread3(String name) {
	super(name);
	
}
@Override
	public void run() {
		
		Display display = new Display();
		display.display(arr);
	}
}
