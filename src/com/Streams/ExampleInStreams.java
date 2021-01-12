package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleInStreams {

	public static void main(String[] args) {
	
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(11);
		
		//System.out.println(list);
		//using lambda
		List<Integer> l1 = list.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		//using without lambda
		for(Integer I: list) {
			if(I%2==0) {
				System.out.println(I);
				
				//to double the value in I
				//list.add(I*2);
			}
			
		
		
		
		}
		
		
	}

}
