package multi_threding;

public class MyThread extends Thread {
	//runing state
@Override
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(i+"   "+Thread.currentThread().getName());
		
		
		
		///sleep state!!!!
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
public static void main(String[] args) {
	//start state
	Thread t1=new MyThread();
	Thread t2=new MyThread();
	//ranable state
	t1.setName("Thread1");
	t2.setName("Thread2");
	//dead state
	t1.start();
	t2.start();
}
}
