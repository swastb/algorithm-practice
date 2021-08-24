package org.myprac.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindPairOfSum {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		int sum = 7;
		System.out.println(pairSum(arr, sum));
		printpairs(arr, sum);

	}

	public static String pairSum(int[] myArray, int sum) {
		StringBuffer pairResult = new StringBuffer();

		System.out.println(Arrays.toString(myArray));

		Set<Integer> tempSet = new HashSet<>();

		for (int i = 0; i < myArray.length; i++) {
			int diff = sum - myArray[i];
			if (tempSet.contains(diff)) {
				pairResult.append(myArray[i] + ":" + diff + ",");
			}

			tempSet.add(myArray[i]);
		}
		return pairResult.toString();
	}

	static void printpairs(int arr[], int sum) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition
			if (s.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			s.add(arr[i]);
		}
	}

}
