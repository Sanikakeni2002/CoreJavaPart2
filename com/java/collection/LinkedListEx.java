package com.java.collection;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		System.out.println("Linked List: "+ll);
		java.util.Iterator<String> x= ll.descendingIterator();
		while(x.hasNext()){
			System.out.println("Values is: "+ x.next());
		}
		
			
		

	}

}
