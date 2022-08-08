package com.java.collection;

import java.util.TreeSet;

public class PhoneEx {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("Mi");
		t.add("Apple");
		t.add("Oopo");
		t.add("Vivo");
		t.add("Samsung");
		t.add("Motorolla");
		System.out.println("Brand Names: " + t);
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(20000);
		t1.add(54000);
		t1.add(730280);
		t1.add(32000);
		t1.add(15000);
		t1.add(42000);
		System.out.println("Price of phone: " + t1);
	}

}
