package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class map {
	public static void main(String[] args) {
		List<Integer>noList=Arrays.asList(11,12,13,14,15,16);//store number list as a list
		
		
		//convert list in to stream
		List<Integer>evenlist=noList.stream().map(i->i).collect(Collectors.toList());
		for(Integer i:evenlist) {
			System.out.println(i);
		}}
}