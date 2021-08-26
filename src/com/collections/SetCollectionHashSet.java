package com.collections;

import java.util.HashSet;

public class SetCollectionHashSet {

	// HashSet : A class which implements Set Interface
	// It doesn't accept duplicate values;
	// It doesn't maintain the insertion order

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();
		hset.add("Delhi");
		hset.add("Mumbai");
		hset.add("Pune");
		hset.add("Chennai");
		hset.add("Kolkatta");
		hset.add("Kanpur");
		hset.add("Delhi");
		hset.add(null);

		System.out.println(hset);

	}

}
