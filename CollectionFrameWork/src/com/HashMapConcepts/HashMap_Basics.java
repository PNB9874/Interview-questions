package com.HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap_Basics {
	public static void main(String[] args) {
		/*Hash map is a class it is implemented by MAP interface
		 * its not thread safe - its unsynchronized
		 * hash map does not maintained any order and indexing
		 * it sores elements in key and value format
		 * duplicate elements not allowed in  hash map
		 * we can store n number of NULL Values but we can store only one NULL Key*/
	 
	HashMap<String, String> map = new HashMap<>();
	map.put("India","new delhi");
	map.put("USA", "WashingtonDC");
	map.put("UK", "London1");
	map.put("UK","London");
	map.put("france", null);
	// to fetch the data from particular map- by using get Method
	System.out.println(map.get("USA"));
	System.out.println(map.get("India"));
	
	System.out.println("************************************");
	
	//Iterate particular hash map by using key set():
	Iterator<String> it = map.keySet().iterator();
	while(it.hasNext()) {
	String key = it.next();
	String value =map.get(key);
	System.out.println("Country: "+key+" and CapitalCity: "+value);
	}
	
	
	System.out.println("-----------------------------------");
	HashMap<String, Integer> marks = new HashMap<>();
	marks.put("telugu", 75);
	marks.put("english", 50);
	marks.put("social", 60);
	marks.put("science", 65);
	marks.put("maths", 55);
	//To iterate marks hash map by using ENTRY SET ()
	Iterator<Entry<String, Integer>> itMarks=marks.entrySet().iterator();
	while(itMarks.hasNext()) {
		Entry<String, Integer> entrySet=itMarks.next();
		//System.out.println(entrySet);
		System.out.println("Subject= "+entrySet.getKey()+" Marks= "+entrySet.getValue());
	}
	
	System.out.println("__________________________________________");
	HashMap<String, String> m_N_h = new HashMap<>();
	m_N_h.put("Jill", "Gopichand");
	m_N_h.put("Balu", "Pk");
	m_N_h.put("Isqe", "Nithin");	
	
	//Iterate m_N_h -By using ForEach() and Lambda->
	m_N_h.forEach((k,v)->System.out.println("Movie= "+k+"  Hero= "+v));
	
	
	
	
	
	
	
	
	}

	private static String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
