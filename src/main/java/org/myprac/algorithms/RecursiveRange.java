package org.myprac.algorithms;

public class RecursiveRange {

	public static void main(String[] args) {
		System.out.println(getRecursiveRange(6));
	}

	private static int getRecursiveRange(int num) {
		if (num == -1) {
			return 0;
		}
		if (num == 0) {
			return 0;
		}

		return num + getRecursiveRange(num - 1);
	}

}
