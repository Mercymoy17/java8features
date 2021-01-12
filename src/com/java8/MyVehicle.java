package com.java8;

public class MyVehicle {

	public static void main(String[] args) {
		
		
		String action = "Driving my new car";
		
		Vehicle v=()->{  
		        return "I have nothing to say.";  
		    };  
		  System.out.println(v.drive());  
		
	}

}
