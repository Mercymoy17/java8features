package com.Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Foreachinjava8 {

	public static void main(String[] args) {
	      Map<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(1, "Monkey");
	      hmap.put(2, "Dog"); 
	      hmap.put(3, "Cat");  
	      hmap.put(4, "Lion");   
	      hmap.put(5, "Tiger");   
	      hmap.put(6, "Bear");
	      /* forEach to iterate and display each key and value pair
	       * of HashMap.    
	       */
	      
	    //Map -> Stream -> Filter -> String
	      String result = hmap.entrySet().stream()
	          .filter(x -> "Bear".equals(x.getValue()))
	         .map(x->x.getValue())
	        .collect(Collectors.joining());
	      System.out.println(result);
	      
	    //Map -> Stream -> Filter -> MAP
	      Map<Integer, String> collect = hmap.entrySet().stream()
	          .filter(x -> x.getKey() == 2)
	          .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
	          
	      // or like this
	      Map<Integer, String> collec = hmap.entrySet().stream()
	          .filter(x -> x.getKey() == 3)
	          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	      
	      //before java 8
	    	/*String result= "";
	    	 
	      for (Map.Entry<Integer, String> entry : hmap.entrySet()){
	    	  if("Lion".equals(entry.getValue())){
	    		  result = entry.getValue();
	    		  
	    		  System.out.println(result);
	    	  }
	      }*/
	      /* forEach to iterate a Map and display the key associated with a
	       * particular value     
	       */
	      hmap.forEach((key,value)->{
	         if("Cat".equals(value)){ 
	            System.out.println("Key associated with Value Cat is: "+key);
	         }
	      }); 
	}
}
