package com.java8;

public class ExampleMain {

	public static void main(String[] args) {
		
		MyFunctionalInterface2 msg = (s,l)-> s*l;
		
		System.out.println(msg.areaOfRectangle(5,4));

	}

}
