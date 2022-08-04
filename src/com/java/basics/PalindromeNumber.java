package com.java.basics;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		121 and 121 12321 12321

		int num = 12321;
		int rev = 0;
		int rem;
		int temp = num;

		while (temp != 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		
		if(num==rev) {
			System.out.println("Given number is palindrome number");
		}
		else {
			System.out.println("Given number is not a palindrome number");
		}

	}

}
