package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<Integer> aint = new LinkedList<Integer>();
		LinkedList<String> astr = new LinkedList<String>();

		aint.add(12);
		aint.add(121);

		// intellisense

		astr.add("Bindu");
		astr.add("Lakshmi");
		astr.add("Chandan");
		astr.add("Piku");
		astr.add("Amaira");
		astr.add("Srikara");
		astr.add(2, "Mamta");

		LinkedList<String> astr2 = new LinkedList<String>();

		astr2.add("Bindu2");
		astr2.add("Lakshmi2");
		astr2.add("Chandan2");
		astr2.add("Piku2");

		// astr.addAll(astr2);
		astr.addAll(2, astr2);

//		for (String s : astr) {
//			System.out.println("Names are : " + s);
//		}

		// System.out.println("========================");

		Iterator<String> it = astr.iterator(); // iterate through a collection astr
		while (it.hasNext()) {
			System.out.println("Names are : " + it.next());
		}
		System.out.println("========================");

		// astr.remove();
		astr.removeAll(astr2);

		it = astr.iterator(); // iterate through a collection astr
		while (it.hasNext()) {
			System.out.println("Names are : " + it.next());
		}

		astr.clear();
		System.out.println("After Clear Names are : " + astr);
	}

}
