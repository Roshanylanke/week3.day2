package week3.day2homeassign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {

		// Declare an ArrayList of type Integer
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		// add the elements in lists
		Collections.addAll(list1, 3, 2, 11, 4, 6, 7);
		Collections.addAll(list2, 1, 2, 8, 4, 9, 7);

		// print the elements of list
		System.out.println("The elements of list1 is :" + list1);

		// print the elements of list1
		System.out.println("The elements of list2 is :" + list2);
		// check the intersection elements
		list2.retainAll(list1);

		// Print the elements intersection elements
		System.out.println("The intersection of value is :" + list2);
	}

}


