package org.myprac.algorithms;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverse("Hello"));
		System.out.println(reverseIterative("Hello"));
	}

	public static String reverse(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static String reverseIterative(String str) {

		StringBuffer reverseString = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString.append(str.charAt(i));
		}
		return reverseString.toString();

	}
}
