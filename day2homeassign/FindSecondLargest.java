package week3.day2homeassign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {

		// Declare an ArrayList of type Integer
		List<Integer> largestnum = new ArrayList<Integer>();
		// add the elements in lists
		Collections.addAll(largestnum, 3, 2, 11, 4, 6, 7);
		System.out.println("The elements of list before sorting  is :" + largestnum);

		// sort the array
		Collections.sort(largestnum);

		System.out.println("The elements of list after sorting is :" + largestnum);

		// print the second value from last
		System.out.println("Second largest number from the list is :" + largestnum.get(4));

	}

	

}
