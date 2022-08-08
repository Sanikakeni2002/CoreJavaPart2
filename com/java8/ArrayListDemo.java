package com.java8;

import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class ArrayListDemo {
//for each example
/*	public static void main(String[] args) {
		List<String> l= new ArrayList<String>();
		l.add("piyu");
		l.add("Aditya");
		l.add("Mayuri");
		l.add("Om");
		int count=0;
		for(String str:l){
			System.out.println(str);
		}
		l.forEach(str->System.out.println(str));//its print 2 time  
	}
}*/
public static void main(String[] args) {
	List<String> l= new ArrayList<String>();
	l.add("piyu");
	l.add("Aditya");
	l.add("Mayuri");
	l.add("Om");
	long count=0;
	/*for(String str:l){
		if(str.length()<6){
			count++;
		}
	}*/
	//Using stream api
	count=l.stream().filter(str->str.length()<6).count();
	System.out.println("There are "+ count +" strings with length less than 6");
	//AllMatch, AnyMatch ,nonMatch we can use
}

}
