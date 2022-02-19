package com.java.basics;

public class IsPalindrome {

	public static void main(String[] args) {
		
		isPalindrome(121);

	}

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int sum = 0;
		int temp;
		temp = number;

		if (number < 1) {
			return false;
		}

		while (number < 0) {
			reverse = number % 10;
			sum = sum * 10 + reverse;
			number = number / 10;

		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}

}
