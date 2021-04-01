package com.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DupEleFrom_Array {

	public static void palindrome(int num) {
		int r = 0;
		int sum = 0;
		int t;
		t = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println("this is palindrome number: ");

		} else {
			System.out.println("this is not palindrome number");
		}

	}

	public static void main(String[] args) {
		
		
		palindrome(545);
		palindrome(151);
		palindrome(656);
		
		
		
		
		
		

		String[] names = { "raj", "ravi", "raj", "chanti" };
		Set<String> set = new HashSet<String>();
		for (String name : names) {
			if (set.add(name) == false) {
				System.out.println(name);
			}

		}

		String[] cities = { "Hyd", "Vizag", "rajahmundry", "Hyd" };

		Set<String> setCity = new HashSet<>();
		for (String city : cities) {
			if (setCity.add(city) == false)
				System.out.println(city);
		}

		// removein duos from arrayList
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("java", "python", "java"));
		LinkedHashSet<String> namesSet = new LinkedHashSet<String>(namesList);
		System.out.println(namesSet);

		// finding odd and even numbers
		int i = 50;
		if (i % 2 == 0) {
			System.out.println(i + " it is even number");
		} else {
			System.out.println(i + " it is odd number");
		}
	}
}
