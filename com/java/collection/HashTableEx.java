package com.java.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Apple", 100);
		ht.put("Mango", 80);
		ht.put("Orange", 50);
		ht.put("Pear", 70);
		System.out.println("Element of hashmap: "+ht);
		System.out.println("Size: "+ht.size());
		System.out.println("Get Element: "+ht.get(50));
		System.out.println("Put if absent: "+ht.putIfAbsent("Grepes", 40));
		System.out.println("Keyset: "+ht.keySet());
		System.out.println("Values : "+ht.values());
		ht.replace("Banana", 70);
		System.out.println("Element of hashmap: "+ht);
		System.out.println("Contains Key: "+ht.containsKey(100));
		System.out.println("Remove element: "+ht.remove(50));
		System.out.println("Element of hashmap: "+ht); 
		for (Map.Entry<String, Integer> entry : ht.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println(ht.entrySet());
	}

}
