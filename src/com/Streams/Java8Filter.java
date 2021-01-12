package com.Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Filter {
// filter a Map by values and return a String.
	public static void main(String[] args) {
		

		        Map<Integer, String> link = new HashMap<>();
		        link.put(1, "google.com");
		        link.put(2, "gmail.com");
		        link.put(3, "yahoo.com");
		        link.put(4, "aws.amazon.com");
		        // Before Java 8
		        
		        String result = "";
		        for (Map.Entry<Integer, String> entry : link.entrySet()) {
		            if ("aws.amazon.com".equals(entry.getValue())) {
		                result = entry.getValue();
		                System.out.println(result);
		            }
		        }
		        
		      //Map -> Stream -> Filter -> String
		        result = link.entrySet().stream()
		                .filter(map -> "aws.amazon.com".equals(map.getValue()))
		                .map(map -> map.getValue())
		                .collect(Collectors.joining());

		        System.out.println("With Java 8 : " + result);
	}

}
