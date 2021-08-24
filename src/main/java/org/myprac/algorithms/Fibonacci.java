package org.myprac.algorithms;

public class Fibonacci {

	
	private static int n1 = 0;
	private static int n2 = 1;
	private static int sum = 0;
	
	public static void main(String[] args) {

		int nthItem = 10;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(getFibRecursive(nthItem));

	}

	public static int getFibRecursive(int nthItem) {

		if (nthItem <= -1) {
			System.out.println("Invalid");
		}
		if (nthItem == 0) {
			return 0;
		}
		if (nthItem == 1 || nthItem == 2) {
			return 1;
		}
		return getFibRecursive(nthItem - 1) + getFibRecursive(nthItem - 2);

	}

	

	private static void printFibonacci(int count) {
		if (count > 0) {
			sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
			printFibonacci(count - 1);
		}
	}

}
