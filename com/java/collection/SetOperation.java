package com.java.collection;

import java.util.HashSet;

public class SetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> set1 = new HashSet< Integer>();
	      HashSet <Integer> set2 = new HashSet <Integer>();
	      set1.add(20);
	      set1.add(40);
	      System.out.println("Set1 = "+ set1);
	      set2.add(60);
	      set2.add(40);
	      System.out.println("Set2 = "+ set2);
	      set1.addAll(set2);
	      System.out.println("Union = "+ set1);
	      set1.retainAll(set2);
	      System.out.println("Intersection  = "+set1);
	      set1.removeAll(set2);
	      System.out.println("Difference = "+set1);
	}

}
