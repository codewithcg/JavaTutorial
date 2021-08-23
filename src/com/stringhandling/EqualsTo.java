package com.stringhandling;

public class EqualsTo {

	public static void main(String[] args) {

		String name01 = "BINDU";
		String name02 = "Lakshmi";
		String name03 = "bindu";

		System.out.println(name01 + " is equal to " + name02 + " ? " + name01.equals(name02));
		System.out.println("Is " + name01 + " equal to " + name03 + " ? " + name01.equals(name03));

		System.out.println("Is " + name01 + " equal to " + name03 + " ? " + name01.equalsIgnoreCase(name03));

	}

}
