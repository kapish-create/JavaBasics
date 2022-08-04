package com.java.basics;

public class TypeCastConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Type casting 
		int a = 10;
//		Not possible due to narrowing the data
//		byte b=a;
//		byte b = 127;
		
		float f= a;
		System.out.println("After casting int into double :"+f);
		byte no1=10;
		byte no2=20;
		byte no3=(byte)(no1+no2);
		System.out.println(no3);
		
//		short s1= (short)a;
		short s1= (byte)(short)a;
		System.out.println(s1);
		
		float no=10.0f;
		double d=10.2;
		System.out.println(no);
		System.out.println(d);
		

	}

}
