package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Java");
		ar.add("Python");
		ar.add("Ruby");
		ar.add("Dot Net");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("Devops");

		// Combine the two Array Lists Using addAll Function

		// ar.addAll(ar2);
		// System.out.println(ar);
		ar.addAll(0, ar2);
		System.out.println(ar);

		// To print only even numbers from given array list
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

		numbers.removeIf(num -> num % 2 == 0);
		System.out.println(numbers);

		// To Print Only Odd Numbers
		numbers.removeIf(num -> num % 2 != 0);
		System.out.println(numbers);

	}

}
