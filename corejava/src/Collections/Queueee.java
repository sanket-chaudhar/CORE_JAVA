package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queueee {
public static void main(String[] args) {
	
		Queue<Integer> que=new PriorityQueue();
		
		que.add(34);
		que.offer(65);
		que.offer(23);
		que.offer(34);
		que.offer(12);
		que.offer(98);
		
		System.out.println(que);
		System.out.println("element by peek :"+que.peek());
		
		System.out.println(que);
		System.out.println("element by pop:"+ que.poll());
		
		System.out.println(que);
		System.out.println("element by remove:"+que.remove(65));
		
		System.out.println(que);
		System.out.println("element by add"+que.add(34));
		
		
	
}
}
