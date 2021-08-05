package com.control;

public class EnhanceForLoop {

	public static void main(String[] args) {

		// Enhanced for loop

		String[] city = new String[] { "Delhi", "Pune", "Chennai" };

		// System.out.println(city[0] + " " + city[1] + " " + city[2]);

		// for each DataType(string here) in Collection (city here), perform the actions
		// within braces

		for (String x : city) {

			if (x.equals("Pune")) {
				System.out.println("IF Block - City is : " + x);
			}

			else {
				System.out.println("City is : " + x);
			}
		}

	}

}
