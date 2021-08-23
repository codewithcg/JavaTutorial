package com.stringhandling;

public class IndexOf {

	public static void main(String[] args) {

		String name01 = "BINDNUuuuNuu";
		String name02 = "Lakshmi";
		String name03 = "bindu";

		System.out.println("Index of " + name01.indexOf("N"));
		System.out.println("Index of N : " + name01.indexOf("N", 3));
		System.out.println("Index of T : " + name01.indexOf("T", 3)); // -1

	}

}
