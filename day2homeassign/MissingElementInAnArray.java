package week3.day2homeassign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray
{
	
	

	public static void main(String[] args) {

		// Declare a variable
		int count = 1;

		// Declare an ArrayList of type Integer
		List<Integer> list = new ArrayList<Integer>();

		// add the elements in lists
		Collections.addAll(list, 1, 2, 3, 4, 7, 6, 8);

		// print the elements before sorting
		System.out.println("The elements before sorting:" + list);

		// sort the array
		Collections.sort(list);

		// print the elements after sorting
		System.out.println("The elements after sorting:" + list);

		// logic for finding the missing element in the array
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != i + count) {
				System.out.println("The Missing elements are :" + (i + count));
				count++;
			}
	
		}
}
}