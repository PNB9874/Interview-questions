package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author pnb98
 *
 */
public class ArrayListCompare {
	// Pushed this code to repo

	public static void main(String[] args) {
		//1. sort and then equals:
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList
				               ("A", "B", "C", "D", "F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList
				               ("A", "B", "C", "D", "E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList
				               ("A","B", "C", "D", "F"));
		// L1 with L2
		Collections.sort(l1);
		Collections.sort(l2);
		boolean comparing  = l1.equals(l2);
		System.out.println("Sort and comparing l1 with l2 : "+comparing);
        
		// L1 With L3
		Collections.sort(l3);
		boolean comparing2 = l1.equals(l3);
	    System.out.println("Comparing L1 with L3 :" +comparing2);
	    
	    
	    //2.Comparing two lists and find out additional element:
	    
	    ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
	    ArrayList<String> l5= new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		/*
		 * l4.removeAll(l5); System.out.println(l4);
		 */
	    
	    //Comparing two lists and finding out the Missing element:
	    l5.removeAll(l4);
	    System.out.println(l5);
	    
	    
	    
	    // Finding out the common elements
	    ArrayList<String> lang = new ArrayList<String>(Arrays.asList("Java", "Python", "C#", "Ruby", "JS"));
	    ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java", "Python", "C#", "Ruby", "PHP"));
	    
	    lang.retainAll(lang2);
	    System.out.println(lang);
	   
	}

}
