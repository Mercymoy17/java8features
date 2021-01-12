package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapwithStream {

	
	public static void main(String[] args) {

    	List<Integer> num = Arrays.asList(1,2,3,4,5,6);
    	
    	int result=0;
    	
    	//using stream and map
       List<Integer> squares = num.stream()
        		.map(n -> n * n)
        		.collect(Collectors.toList());
        System.out.println(squares); 
    	
    	
     //using java 7 without stream and map
    	/*for(Integer I: num) {
    		
    		result = I*I;
    	}
    	  System.out.println("Sum = " + result);*/
    }
}
