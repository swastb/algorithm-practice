package org.myprac.algorithms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] result = new int[arr.length];
		arr = reverseArrayIterative(arr);
		System.out.println(Arrays.toString(arr));

		reverseArrayRecursive(arr, arr.length, result);
		System.out.println(Arrays.toString(result));
	}

	public static int[] reverseArrayIterative(int[] arr) {
		int r = arr.length - 1;
		int l = 0;

		while (l < r) {
			int tmp = arr[r];
			arr[r] = arr[l];
			arr[l] = tmp;
			l++;
			r--;
		}
		return arr;
	}

	public static void reverseArrayRecursive(int[] arr, int length, int[] result) {
		if (length == 0) {
			result[0] = arr[0];
		} else {
			result[length - 1] = arr[length - 1];
			reverseArrayRecursive(arr, length - 1, result);
		}
	}
}
