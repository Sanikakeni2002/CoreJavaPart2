package com.java.collection;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetEx {
	enum Color {
		Red, Green, Black, Orange, White, Blue
	}

	public static void main(String[] args) {
		EnumSet<Color> c = EnumSet.noneOf(Color.class);
		System.out.println("Empty Enum: " + c);
		EnumSet<Color> c1 = EnumSet.range(Color.Green, Color.White);
		System.out.println("Colors : " + c1);
		Iterator<Color> itr = c1.iterator();
		while (itr.hasNext())
			;
		System.out.println(itr.hashCode());
		// System.out.println("Added color: "+c1);
		EnumSet<Color> c3 = EnumSet.allOf(Color.class);
		System.out.println("Empty Enum: " + c);
	}

}
