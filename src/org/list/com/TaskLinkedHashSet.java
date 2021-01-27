package org.list.com;

import java.util.*;
// Set
//Linked Hash Set
public class TaskLinkedHashSet {
	public static void main(String[] args) {
		Set<Integer> li=new LinkedHashSet<Integer>();
		li.add(24);
		li.add(56);
		li.add(55);
		li.add(98);
		li.add(76);
		
		//Get size of a Set
		int listsize=li.size();
		System.out.println("Set Size: "+listsize);
		
		//To Remove
		li.remove(56);
		System.out.println("List after removed One item: "+li);
		
		//To Check the Value presents
		boolean b=li.contains(98);
		System.out.println(b);
		
		//To Check whether set is empty are not
		boolean b1=li.isEmpty();
		System.out.println("The Set is Empty: "+b1);
		
	}

}
