package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<>();
		li.add("Shivani");
		li.add(0, "Mayuri");
		li.add("Sneha");
		li.add(1, "Savita");
		System.out.println("List of elements: " + li);
		System.out.println("Length of list: " + li.size());
		System.out.println("Get of list: " + li.get(2));
		System.out.println("Set value of list: " + li.set(3, "Sayali"));
		System.out.println("List of elements: " + li);
		System.out.println("Remove element: " + li.remove(2));
		System.out.println("List of elements: " + li);
		System.out.println("Contains of elements: " + li.contains("Savita"));
		li.add("Sanika");
		System.out.println("Get of list: " + li);
		System.out.println("List of elements: " + li);
		Iterator itr= li.iterator();
		while(itr.hasNext());
		System.out.println("iterator"+itr.next());

	}

}
