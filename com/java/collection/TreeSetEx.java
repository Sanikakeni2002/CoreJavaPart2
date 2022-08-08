package com.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<String>();
		t.add("Savita");
		t.add("Sanika");
		t.add("Mayuri");
		System.out.println("Tree set elements are: "+t);
		//Iterator<String> itr = t.iterator();
		//while (itr.hasNext()) {
			//System.out.println(itr.next());
		}
	}

