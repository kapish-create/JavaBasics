package com.java.basics;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count=0;
		for (int i = 1; i <= 1000; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				count ++;
				sum = sum + i;
				System.out.println("The numbers divisible by 3 and 5 are =" + i);

			}
			if(count==5) {
				break;
			}
			

		}
		System.out.println("Sum of the numbers = " + sum);

	}

}
