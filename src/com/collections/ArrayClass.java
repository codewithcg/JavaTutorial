package com.collections;

public class ArrayClass {

	public static void main(String args[]) {

		try {
			int[] ar = { 1, 2, 3, 4 };

			String[] st = { "Delhi", "Mumbai", "Chennai", "Kolkatta" };

			// st[4] = "Pune";

			System.out.println(st[4]);
		}

		catch (Exception are) {
			System.out.println(are);
		}

		// data-type [] refvariable = {}; // the number of data decides the size of the
		// array

		// data-type [] refvariable = new data-type [10]; the number decides the size of
		// the array

		int ar1[] = {};
		int[] ar2 = {};

		int[] at = new int[10];
		at[0] = 10;
		at[1] = 11;
		at[2] = 12;
		at[3] = 13;
		at[4] = 14;

		System.out.println(at[4]);

		for (int i = 0; i < at.length; i++) {

			System.out.println(at[i]);
		}

	}

}
