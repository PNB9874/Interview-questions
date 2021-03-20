package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveOdd_EvenNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>
		(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
		System.out.println(numbers);
		
	//	numbers.removeIf(num -> num%2 ==0);
	//	System.out.println(numbers);
		
		// to print even numbers
		numbers.removeIf(num -> num%2 !=0);
		System.out.println(numbers);
	}

}
