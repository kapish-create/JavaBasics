package com.java.basics;

public class ToMilesPerHour {
	public static long toMilesPerHour(double kiloMetersPerHr) {
		if (kiloMetersPerHr < 0) {
			return -1;
		}
		return Math.round(kiloMetersPerHr / 1.609);
	}

	public static void printConversion(double kiloMetersPerHr) {
		if (kiloMetersPerHr < 0) {
			System.out.println("Invalid value");
		}
		long milesPerHour = toMilesPerHour(kiloMetersPerHr);
		System.out.println(kiloMetersPerHr + " km/h= " + milesPerHour + " mi/h");

	}

}
