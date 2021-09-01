package com.stringsImmutable;

// Strings are immutable - interview question and a good concept to know

// Immutable - not changeable, cannot grow = Array

//Ternary Operator 

public class ImmutableEg {

	public static void main(String[] args) {

		String x = "abc";
		String y = "abc";
		x = x.concat("pqr");
		y = x + "d";
		y = "reinvent";

		String z = "abc";

		System.out.println(x);
		System.out.println(y);

		StringBuilder sb = new StringBuilder("Hello"); // mutable
		sb.append("World");
		System.out.println(sb);
		sb.append("Lakshmi");
		System.out.println(sb);

		StringBuffer sb2 = new StringBuffer("name"); // mutable
		sb2.append("World2");
		System.out.println(sb);
		sb2.append("Lakshmi2");
		System.out.println(sb);

		// Thread

	}

}
