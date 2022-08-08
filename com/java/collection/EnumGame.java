package com.java.collection;

import java.util.EnumSet;

public class EnumGame {
	enum Game {
		Cricket, Hockey, Tennis
	}

	public static void main(String[] args) {
		
		EnumSet<Game> games1 = EnumSet.allOf(Game.class);
		EnumSet<Game> games2 = EnumSet.noneOf(Game.class);
		games2.add(Game.Hockey);
		System.out.println("EnumSet using add(): " + games2);
		games2.addAll(games1);
		System.out.println("EnumSet using addAll(): " + games2);
	}

}
