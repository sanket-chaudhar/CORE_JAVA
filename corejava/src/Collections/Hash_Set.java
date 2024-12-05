package Collections;

import java.util.HashSet;

public class Hash_Set {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	
	hs.add(23);
	hs.add(43);
	hs.add(56);
	hs.add(23);
	hs.add(23);
	hs.add(76);
	
	System.out.println(hs);
	System.out.println(hs.contains("20"));
	hs.remove(10);
	System.out.println(hs.remove(56));
	System.out.println(hs);
	
	System.out.println("size of hashset:"+hs.size());
	System.out.println(hs);
	
	if(hs.isEmpty()) {
		System.out.println("list is empty");
		
	}
	else {
	System.out.println("list is not empty");
	}
	System.out.println(hs);
	
}

}
