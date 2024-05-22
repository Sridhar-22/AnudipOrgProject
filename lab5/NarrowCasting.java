package com.lab5;

public class NarrowCasting {

	public static void main(String[] args) {
		double bigValue = 123.4;
		int smallValue;

		smallValue = (int) bigValue;

		System.out.println("Original double value: " + bigValue);
		System.out.println("Narrowed int value: " + smallValue);
	}
}
