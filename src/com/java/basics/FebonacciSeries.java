package com.java.basics;

public class FebonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stubn

//		Febonacci series 0 1 1 2 3 5 8 13 21 ........n

		int num1 = 0;
		int num2 = 1;

		System.out.print(num1 + " " + num2);

		for (int i = 1; i <= 20; i++) {
			int result = num1 + num2;
			System.out.print(" "+ result);
			num1 = num2;
			num2 = result;
		}

	}

}
