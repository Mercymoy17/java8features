package com.java8;

public class DefaultMainmethod implements Java8DefaultMethod{

	
	@Override
	public void existingMethod(String str) {
		System.out.println("String is"+ str);
		
	}  
	
    public static void main(String[] args) {  
    	
    	DefaultMainmethod obj = new DefaultMainmethod();
    	
    	obj.newMethod();
    	
    	obj.existingMethod("Java 8 is a new feature");
    }

	
	
	}



