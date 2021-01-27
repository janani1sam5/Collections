package org.list.com;

import java.util.Hashtable;
import java.util.Map;

// Hash Table
public class TaskHashTable {
	
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(20,"Anu");
		ht.put(30, "Jana");
		ht.put(40, "Ravi");
		ht.put(50, "Kavi");
		
		for(Map.Entry<Integer, String> m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		
	     System.out.println("Before remove: "+ ht);    
	     // Remove value for key 30
	     ht.remove(30);  
	     System.out.println("After remove: "+ ht); 
	     
	     //specify the if and else statement as arguments of the method  
	     System.out.println(ht.getOrDefault(20, "Not Found"));  
	     System.out.println(ht.getOrDefault(10, "Not Found"));  
	     
	     //Inserts (as the specified pair is unique )
	     ht.putIfAbsent(60,"Sam");  
	     System.out.println("Updated Map: "+ht);  
	     //Returns the current value (as the specified pair already exist ) 
	     ht.putIfAbsent(40,"Kavi");  
	     System.out.println("Updated Map: "+ht); 
		
		
		
	}

}
