package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program1 {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add(45);
	list .add(87.56);
	list.add(79);
	list.add("seed");
	list.add(54);
	
	
	Iterator itr=list.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
		
		
	}
	
}
}
