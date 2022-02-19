package com.java.basics;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 6, 5, 7, 4, 8, 4, 8, 4, 78, 4, 6, 90 };
		secondLargestInArray(a);

	}

	public static int secondLargestInArray(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
			if (i == 1) {
				break;
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
		}
		int secondLargestNumber = a[1];
		System.out.println("Second largest number in array= " + a[1]);

		return secondLargestNumber;
	}

}
