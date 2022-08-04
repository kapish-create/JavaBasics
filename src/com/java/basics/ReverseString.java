package com.java.basics;

public class ReverseString {

	public static void main(String[] args) {
		reverseString("kapish");

	}

	public static String reverseString(String reverseStringValue) {

		String revString = "";
		for (int i = reverseStringValue.length() - 1; i >= 0; i--) {
			revString = revString + reverseStringValue.charAt(i);

		}
		System.out.println("Reversed String :" + revString);
		return revString;

	}

}
