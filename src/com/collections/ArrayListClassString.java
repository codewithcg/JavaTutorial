package com.collections;

import java.util.ArrayList;

public class ArrayListClassString {

// why the name ArrayList : It implements List Interface

	public static void main(String[] args) {

		ArrayList<String> astr = new ArrayList<String>();
		ArrayList astrg = new ArrayList();

		astr.add("Delhi"); // 0
		astr.add("Mumbai"); // 1
		astr.add("Chennai"); // 2
		astr.add("Pune"); // 3

		System.out.println(astr);

		astr.add(2, "Kolkatta"); // 2
		System.out.println(astr);

		astr.remove(2);
		System.out.println(astr);

		astr.remove(2);
		System.out.println(astr); // Not an efficient way to access Arraylist data

		astr.remove("Delhi2");
		System.out.println(astr);

		for (String vs : astr) {
			System.out.println(vs);
		}

		// astrg.add(12);
		// astrg.add("Bindu");

	}

}
