package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sorting {
public static void main(String[] args) {
	LinkedList<String>list  =new LinkedList();
	list.add("canada");
	list.add("brazil");
	list.add("india");
	list.add("japan");
	
	for (String str:list) {
		System.out.println(str);
		
	}
	System.out.println(list);
	System.out.println("=============================");
	
	Collections.sort(list);
	System.out.println("Sorted List:");
    for (String str : list) {
        System.out.println(str);
	
	
}
}}
