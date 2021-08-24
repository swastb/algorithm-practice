package org.myprac.algorithms;

public class MissingNumber {

	public static void main(String[] args) {

		int[] numberArr = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		System.out.println(missingNumber(numberArr));

	}

	private static int getDuplicateNumber(int[] numberArr) {
		int actualSum = 0;

		int length = numberArr.length - 1;
		int correctSum = (length * (length + 1)) / 2;
		//System.out.println(correctSum);

		for (int i = 0; i < numberArr.length; i++) {
			actualSum = actualSum + numberArr[i];
		}

		return (actualSum - correctSum) ;

	}

	private static int missingNumber(int[] numberArr) {

		int givenSum = 0;
		int actualSum = 0;

		for (int i = 0; i < numberArr.length; i++) {
			givenSum = givenSum + numberArr[i];
		}
		System.out.println(givenSum);

		for (int i = 1; i < numberArr.length + 2; i++) {
			actualSum = actualSum + i;
		}
		int correctSum = ((numberArr.length +1) * (numberArr.length + 2)) / 2;
		System.out.println(correctSum);

		return correctSum - givenSum;

	}

}
