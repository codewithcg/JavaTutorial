package com.stringhandling;

public class CharAt {

	String name = "Bindu"; // common one

	// String colour = new String("Bindu"); // can be used as well

	// Strings are immutable

	public static void main(String[] args) {

		CharAt sc = new CharAt();

		char cg = sc.name.charAt(0);
		System.out.println(cg);

	}

}
