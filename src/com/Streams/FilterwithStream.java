package com.Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterwithStream {

	 public static void main(String[] args) {
			List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

			//List<String> longnames = names.stream() // converting the list to stream
			
					//.filter(str -> str.length() > 6) // filter the stream to create a new stream
					//.collect(Collectors.toList()); // collect the final stream and convert it to a List
			
			
			List<String> longnames = names.stream().filter(str -> str.length() > 6).collect(Collectors.toList());
			longnames.forEach(System.out::println);

			System.out.println(names);
			
			
	
	//without java 8
	/*for(String s: names) {
		
		if(s.length()>6) {
			
			System.out.println(s);
		}
		
	}*/
	//with java 8 lambda and stream and filter
	
  }
}
