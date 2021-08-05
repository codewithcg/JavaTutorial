package com.control;

public class Switch {

	public static void main(String[] args) {

		// String[] x = new String[] { "Delhi", "Pune", "Mumbai" };

		// System.out.println(x[0]);

		String city = "Blr";

		switch (city) {

		case "Delhi":
			System.out.println("I am in Delhi");
			break;

		case "Pune":
			System.out.println("I am in Pune");
			break;

		case "Mumbai":
			System.out.println("I am in Mumbai");
			break;

		case "Hyderabad":
			System.out.println("I am in Mumbai");
			break;

		default:
			System.out.println("Nothing matched, Its Bangaluru");
		}

		System.out.println("I am out of switch");
	}

}
