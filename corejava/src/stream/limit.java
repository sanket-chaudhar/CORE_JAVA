package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class limit {
	public static void main(String[] args) {
		List<Integer>noList=Arrays.asList(11,11,13,13,15,16,17,17,20,20);//store number list as a list
		
		
		//convert list in to stream
		List<Integer>evenList=noList.stream().limit(6).collect(Collectors.toList());
		for(Integer i:evenList) {
			System.out.println(i);
		}}
}
