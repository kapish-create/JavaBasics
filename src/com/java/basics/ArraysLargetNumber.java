package com.java.basics;

public class ArraysLargetNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 1, 2, 3, 4, 5, 10, 15, 18, 20 };
		int largetNumber = largestInArray(array1);
		System.out.println(largetNumber);

	}

	public static int largestInArray(int[] a) {
		int maxValue = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > maxValue) {
				maxValue = a[i];
			}
		}

		return maxValue;
	}

}
