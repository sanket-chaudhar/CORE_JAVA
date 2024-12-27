package multi_threding;

public class MainApp {
public static void main(String[] args) {
	Thread t1=new MyThread3("sharukh");
	Thread t2=new MyThread3("salman");
	
	t1.start();
	t2.start();
}
}
