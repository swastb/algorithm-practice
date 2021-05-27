package org.myprac.algorithms;

import java.util.Arrays;

/**
 * Counting sort is a sorting technique based on keys between a specific range.
 * It works by counting the number of objects having distinct key values (kind
 * of hashing). Then doing some arithmetic to calculate the position of each
 * object in the output sequence.
 *
 */
public class CountSort {
	public static void main(String[] args) {
		int[] unSortedArray = { 1, 0, 0, 3, 4, 5, 1, 0 };

		int maxItem = 5;

		System.out.println(Arrays.toString(countingSort(unSortedArray, maxItem)));
	}

	public static int[] countingSort(int[] unSortedArray, int maximumItem) {

		int[] counter = new int[maximumItem];
		int[] sortedArray = new int[unSortedArray.length];

		//Create the count array which is of len K. 
		//Count the same elements present in the array a and 
		// put that number of in the count array. 
		for (int i = 0; i < unSortedArray.length; i++) {
			int element = unSortedArray[i];
			++counter[element];
		}
		System.out.println("counter first is " + Arrays.toString(counter));

		// Update the counter array 
		for (int i = 1; i < counter.length; i++) {
			counter[i] = counter[i - 1] + counter[i];
		}
		System.out.println("counter now is " + Arrays.toString(counter));

		for (int i = unSortedArray.length - 1; i >= 0; i--) {
			int elementToBeAdded = unSortedArray[i];
			int index = counter[elementToBeAdded] - 1;
			sortedArray[index] = elementToBeAdded;
		}
		return sortedArray;
	}
}
