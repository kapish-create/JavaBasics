package com.java.basics;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumber(-1);

	}

	public static void checkNumber(int number) {
		if (number > 0) {
			System.out.println("The given number is positive Number = " + number);
		} else if (number < 0) {
			System.out.println("The given number is negative numbe =" + number);
		} else {
			System.out.println("The given number is zero= " + number);
		}
	}

}
