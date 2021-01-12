package com.java8;

public class LambdaExpressionExample {
    //Without Lambda Expression
	public static void main(String[] args) {
		
		String word = "Iam Saying come" ;
		  
	        //without lambda, Sayable implementation using anonymous class  
		 Sayable d=new Sayable(){ public void say(){System.out.println(word);}
		      
	              
	        };  
	        d.say();  
	    }  
	}


   //Java Lambda Expression Example
/*
 * public class LambdaExpressionExample {
    //Without Lambda Expression
	public static void main(String[] args) {
		
		String word = "Iam Saying come" ;
		  
	        //without lambda, Sayable implementation using anonymous class  
		// Sayable d=new Sayable(){ public void say(){System.out.println(word);}
		    
		      Sayable d= () -> {System.out.println(word);
	              
	        };  
	        d.say();  
 * 
 */


