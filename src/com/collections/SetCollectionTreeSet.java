package com.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetCollectionTreeSet {

	// TreeSet : A class which implements Set Interface
	// It doesn't accept duplicate values;
	// It saves the elements in Ascending order
	// no null

	public static void main(String[] args) {

		TreeSet<String> tset = new TreeSet<String>();
		tset.add("Delhi");
		tset.add("Mumbai");
		tset.add("Pune");
		tset.add("Chennai");
		tset.add("Kolkatta");
		tset.add("Kanpur");
		tset.add("Delhi");
		tset.remove("Kolkatta");
		// tset.add(null);

		System.out.println(tset);

	}

}
