package org.myprac.algorithms;

public class CalculatePower {

	public static void main(String[] args) {

		int num = 3;
		int power = 4;
		System.out.println(calCulatePower(num, power));

	}

	public static int calCulatePower(int num, int power) {
		if (power <= 0) {
			return 1;
		} else if (power == 1) {
			return num;
		}
		return num * calCulatePower(num, power - 1);
	}
}
