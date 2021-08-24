package org.myprac.algorithms;

public class SumRecursion {

	public static void main(String[] args) {
		System.out.println(getSumRecursion(15051983));
	}

	public static int getSumRecursion(int num) {
		if (num <= 0) {
			return 0;
		}
		return getSumRecursion(num / 10) + num % 10;
	}
}
