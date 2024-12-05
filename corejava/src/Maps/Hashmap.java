package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
public static void main(String[] args) {
	Map<String,Long>phoneDirectory=new HashMap<String,Long>();
	
	phoneDirectory.put("sagar",9552739243l);
	phoneDirectory.put("ravi",7855484343l);
	phoneDirectory.put("ram", 6787654324l);
	phoneDirectory.put("om",6578438474l);
	phoneDirectory.put("sarthak",3572438474l);
	phoneDirectory.put("sampat",23415438474l);
	phoneDirectory.put("karan",8978438474l);
	phoneDirectory.put("ganesh",6578438474l);
	
	
	System.out.println(phoneDirectory.keySet());
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	
	System.out.println(phoneDirectory.containsKey("sampat"));
	System.out.println("==========================================");
	
	System.out.println("contact no of ganesh:"+phoneDirectory.get("ganesh"));
	System.out.println("==========================================");
	
	for(Entry<String,Long>entry:phoneDirectory.entrySet()) {
		
		
		System.out.println(entry);
	}
	
	
	
	
	
}
}
