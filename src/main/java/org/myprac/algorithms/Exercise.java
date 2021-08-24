package org.myprac.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise {
	static int[] middle(int[] arr) {
		
		return Arrays.copyOfRange(arr, 1, arr.length - 1);
	}

	static String firstSecond(Integer[] myArray) {

		List<Integer> myList = Arrays.asList(myArray);
		Collections.sort(myList);

		int lastItem = myList.get(myList.size() - 1);
		int last2ndItem = myList.get(myList.size() - 2);
		for (int i = myList.size() - 2; i > 0; i--) {
			if (lastItem != myList.get(i)) {
				last2ndItem = myList.get(i);
				break;
			}
		}
		return lastItem + "" + last2ndItem;
	}

	public static void main(String[] args) {
		Integer[] arr = { 3, 4, 6, 4, 2, 6 };
		System.out.println(firstSecond(arr));
	}

}
