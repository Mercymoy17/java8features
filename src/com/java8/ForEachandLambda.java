package com.java8;

import java.util.ArrayList;

public class ForEachandLambda {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("California");
		list.add("Miami");
		list.add("Florida");
		list.add("LA");
		list.add("Austin");
		list.add("Houston");
		
	/*	//without forEach and lambda
		
		for(String s: list ) {
			
			System.out.println(s);
			
		}
		
*/
		//using lambda and forEach loop
		
		list.forEach((n)-> {System.out.println(n);});
		
	}
	

}
