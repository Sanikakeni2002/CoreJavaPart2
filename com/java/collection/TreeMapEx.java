package com.java.collection;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100, "Apple");
		tm.put(85, "Pear");
		tm.put(90, "Grapes");
		tm.put(10, null);
		tm.remove(100);
		tm.descendingMap();
		
		for (Entry<Integer, String> m : tm.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

	}
}
