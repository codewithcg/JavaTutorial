package com.collections;

import java.util.LinkedHashSet;

// HashSet - no duplicate, no insertion order, accepts null
// TreeSet - no duplicate, stores in ascending order, doesn't accept null
// LinkedHashSet - no duplicate, it maintains the insertion order, , accepts null

public class LinkedHashSetEg {

	public static void main(String[] args) {

		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

		lhset.add("Lakshmi");
		lhset.add("Chandan");
		lhset.add("Bindhu");
		lhset.add("Chandan");
		lhset.add("23");
		lhset.add(null);

		System.out.println("Values are " + lhset);

		lhset.remove("Bindhu");
		System.out.println("Values are " + lhset);

	}

}
