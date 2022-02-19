package com.java.basics;

public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfDigit(123);
		System.out.println("The sum digit = " + sumOfDigit(1234));

	}

	public static int sumOfDigit(int number) {
		if (number < 10) {
			return -1;

		}
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		return sum;

	}

}
