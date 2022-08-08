package com.java.collection;

import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
		PriorityQueue<String> pq= new PriorityQueue<String>();
		pq.add("Mayuri");
		pq.add("Piyu");
		pq.add("Sanika");
		pq.add("Shivani");
		System.out.println("Priority elements are: "+pq);
		System.out.println(pq.peek());
		System.out.println("Remove: "+pq.poll());
		System.out.println("Priority elements are: "+pq);
		
	}

}
