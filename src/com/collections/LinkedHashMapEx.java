package com.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// LinkedHaspMap maintains the insertion order because we have the word Linked

public class LinkedHashMapEx {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(12, "Lakshmi");
		lmap.put(14, "Bindu");
		lmap.put(10, "Chandan");
		lmap.put(100, "Chandan");
		lmap.put(103, "Chandan");
		lmap.put(11, "Chandan");
		lmap.put(142, "Surjit");

		Set set = lmap.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("Key is : " + mentry.getKey() + ", Value is : ");
			System.out.println(mentry.getValue());
		}

	}

}
