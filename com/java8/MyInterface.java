package com.java8;

interface MyInterface {
	default void newMethod() {
		System.out.println("Newly added default method");
	}

	void existingMehtod(String str);
}

class Example2 implements MyInterface {

	@Override
	public void existingMehtod(String str) {
		System.out.println("String is: " + str);
	}

	public static void main(String[] args) {
		Example2 obj = new Example2();
		((MyInterface) obj).newMethod();
		((MyInterface) obj).existingMehtod("Java 8 is easy to learn");
	}

}