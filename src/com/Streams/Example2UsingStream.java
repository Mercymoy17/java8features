package com.Streams;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Example2UsingStream {

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
		
		List<Integer> L1 = list.stream().filter(I->I%2==0).collect(Collectors.toList());
		
		System.out.println(L1);
	}

}
