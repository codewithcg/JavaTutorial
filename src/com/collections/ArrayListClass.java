package com.collections;

import java.util.ArrayList;

public class ArrayListClass {

// why the name ArrayList : It implements List Interface

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 54 }; // array

		ArrayList<Integer> aint = new ArrayList<Integer>(4);
		ArrayList<String> astr = new ArrayList<String>();
		ArrayList astrg = new ArrayList();

		aint.add(1); // 0
		aint.add(2); // 1
		aint.add(7); // 2
		aint.add(17); // 3

		System.out.println(aint);

		aint.add(2, 20); // 2
		System.out.println(aint);

		aint.remove(2);
		System.out.println(aint);

		aint.remove(2);
		System.out.println(aint);

		aint.remove(17); // Not possible, use aint.remove(Integer.valueOf(17));
		// aint.remove(Integer.valueOf(17));
		System.out.println(aint);

	}

}
