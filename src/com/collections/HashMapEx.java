package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map contains Key, Value pairs

// Hash = not maintain insertion order
// Tree = always in ascending order
// Linked = maintain the insertion order

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(12, "Lakshmi");
		hmap.put(14, "Bindu");
		hmap.put(10, "Chandan");
		hmap.put(100, "Chandan");
		hmap.put(103, "Chandan");
		hmap.put(11, "Chandan");
		hmap.put(142, "Surjit");

		// System.out.println(hmap);

		for (Integer key : hmap.keySet()) {
			// System.out.println("Key: " + key);
		}

		for (String val : hmap.values()) {
			// System.out.println("Value: " + val);
		}

		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("Key is : " + mentry.getKey() + ", Value is : ");
			System.out.println(mentry.getValue());
		}

	}

}
