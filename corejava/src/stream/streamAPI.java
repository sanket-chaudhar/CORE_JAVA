package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPI {
public static void main(String[] args) {
	List<Integer>noList=Arrays.asList(11,12,13,14,15,16,17,18,19,20);//store number list as a list
	
	Stream<Integer>stream=noList.stream();
	//convert list in to stream
	List<Integer>evenlist=stream.filter(i->i%2==0).collect(Collectors.toList());
	for(Integer i:evenlist) {
		System.out.println(i);
	}
}
}

