package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> hm= new HashMap<String, Integer>();
		hm.put("White", 1);
		hm.put("Black", 2);
		hm.put(null, 0);
		hm.put("Red", 3);
		hm.put("White",4);
		
		for(Map.Entry<String, Integer> entry: hm.entrySet()){
			System.out.println(entry.getKey());
		}
		hm.putIfAbsent("Pink", 6);
		hm.replace("Pink", 7);
		hm.containsKey(1);
		hm.remove(2);
		System.out.println("Colors and values: "+hm);
		
	}

}
