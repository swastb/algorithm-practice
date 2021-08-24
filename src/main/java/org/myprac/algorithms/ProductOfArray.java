package org.myprac.algorithms;

public class ProductOfArray {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		System.out.println(productofArray(A, A.length));
	}

	public static int productofArray(int A[], int N) {
		if (N == 0) {
			return 0;
		} else if (N == 1) {
			return A[0];
		} else {
			return A[N-1] * productofArray(A, N - 1);
		}

	}
}
