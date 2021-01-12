package com.java8;

public class Main {
		
		  public static void main(String args[]) {
		        // lambda expression
		    	MyFunctionalinterface msg = () -> {
		    		return "Hello world";
		    	};
		        System.out.println(msg.sayHello());
		    }
		}