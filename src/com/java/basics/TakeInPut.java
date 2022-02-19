package com.java.basics;

import java.util.Scanner;

public class TakeInPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = scanner.nextLine();
		scanner.close();
		System.out.println("Name= " + name);

	}

}
