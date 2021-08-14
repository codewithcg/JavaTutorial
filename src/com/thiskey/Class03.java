package com.thiskey;

public class Class03 {

	int index;
	String colour;

	public Class03() {
		this(23);
	}

	public Class03(String abc) {
		System.out.println("I have : " + abc);
	}

	public Class03(int in) {
		this("Bindu");
		System.out.println("I have : " + in);
	}

	public String abc(int in) {

		int c = 12 + in;
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		Class03 c3 = new Class03(45);
		String value = c3.abc(23);
		System.out.println(value);
	}

}
