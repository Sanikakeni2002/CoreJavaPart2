package com.java.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<>(8,(float)0.50);
		HashSet<Integer> hset1 = new HashSet<Integer>();
		
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		hset.add(60);
		hset.add(70);
		hset.add(null);
		System.out.println("Values inserted in set are: " + hset);
	    System.out.println(hset.isEmpty());
		System.out.println(hset.remove(30));
		System.out.println("Values inserted in set are: " + hset);
		System.out.println(hset.size());
		System.out.println(hset.contains(10));
		System.out.println(hset.hashCode());
		hset.addAll(hset);
	}

}
