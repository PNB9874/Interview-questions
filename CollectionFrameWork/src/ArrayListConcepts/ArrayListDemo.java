package ArrayListConcepts;

import java.util.ArrayList;

public class ArrayListDemo {
	// ArrayList is a default class and dynamic array
	// array list does not Allow Negative index
	
	
	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add("Tom");
		ar.add(34.52);
		ar.add(true);
		
		System.out.println(ar.get(0));
		
		System.out.println(ar.size());
		ar.add("Chanti");
		System.out.println(ar.size());
		System.out.println(ar);
		
		System.out.println("___________");
		
		for (Object obj : ar) {
			System.out.println(obj);			
		}
		
		ar.remove("Chanti");
		System.out.println(ar);
		System.out.println("&&&&&&&");
		// What is the lowest index 
		System.out.println("LI "+ 0);
		
		// Highest Index
		System.out.println("HI ="+ (ar.size()-1));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
