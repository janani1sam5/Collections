package org.list.com;
import java.util.*;

// Collections
// Array List
public class TaskArrayList {

	public static void main(String[] args) {
		
		
		//Creating Array List
		ArrayList<Integer> alist=new ArrayList<Integer>();
		//Adding object in Array list
		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		
		//Traversing list through Iterator
		Iterator it=alist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//To get Particular value using Index 
		Integer in=alist.get(2);
		System.out.println("Getting Particuler Value with Index(2): "+in);
		
		//To Remove
		alist.remove(0);
		System.out.println("After remover 1st Value: "+alist);
		
		//To replace value
		alist.set(2, 400);
		System.out.println("Replacing the Value: "+alist);
		
		//To Add value in between
				alist.add(1, 200);
				System.out.println("Adding the Value: "+alist);
		
		//To remove all the items
		alist.clear();
		System.out.println("Memory Cleared"+alist);
				
	}


}
