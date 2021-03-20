package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	public static void main(String[] args) {

		// 1.Using Linked Hash Set removing duplicate elements

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList
				                     (1, 2, 3, 2, 3, 4, 5, 6, 4, 5, 7, 8, 4, 7));
		System.out.println(numbers);
		LinkedHashSet<Integer> lHashset = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numList = new ArrayList<Integer>(lHashset);
        System.out.println(numList);

		// Using stream() removing duplicates
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList
				                       (1, 2, 3, 2, 3, 4, 5, 6, 4, 5, 7, 8, 4, 7));
		List<Integer> marksListWithoutDups = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println("stream List: " +marksListWithoutDups);
	}

}
