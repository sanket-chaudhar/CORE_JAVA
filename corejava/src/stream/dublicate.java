package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class dublicate {
	public static void main(String[] args) {
		List<Integer>noList=Arrays.asList(11,11,13,14,15,15,17,19,19,20);//store number list as a list
		
		
		//convert list in to stream
		List<Integer>duplist=noList.stream().distinct().collect(Collectors.toList());
		for(Integer k:duplist) {
			System.out.println(k);
		}}
}
