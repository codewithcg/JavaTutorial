package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// CRUD Operation
// C- Create
// R- Retrieve
// U - Update
// D- Delete

public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(12, "Lakshmi");
		tmap.put(14, "Bindu");
		tmap.put(10, "Chandan");
		tmap.put(100, "Chandan");
		tmap.put(103, "Chandan");
		tmap.put(11, "Chandan");
		tmap.put(142, "Surjit");

		Set set = tmap.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("Key is : " + mentry.getKey() + ", Value is : ");
			System.out.println(mentry.getValue());
		}

	}

}
