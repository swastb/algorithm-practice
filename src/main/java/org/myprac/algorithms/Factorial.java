package org.myprac.algorithms;

public class Factorial {

	public static void main(String[] args) {
		long num = 100;

		System.out.println(recursiveCall(num));
		System.out.println(withoutRecursion(num));
	}

	public static long recursiveCall(long i) {
		if (i <= -1) {
			return -1;
		} else if (i == 0 || i == 1) {
			return 1;
		} else {
			return i * recursiveCall(i - 1);
		}
	}

	public static long withoutRecursion(long i) {
		long result = 1;
		if (i <= -1) {
			return -1;
		}
		while (i > 0) {
			result = result * i;
			i--;
		}
		return result;
	}

}
