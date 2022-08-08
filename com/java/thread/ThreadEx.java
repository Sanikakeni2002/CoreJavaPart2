package com.java.thread;

class Thread1 extends Thread {
	public void run() {
		System.out.println("Thread1 is running...");
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("Thread2 is running...");
	}
}

class Thread3 extends Thread {
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println(i);
		}
		System.out.println("Thread3 is running...");
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
		Thread2 t1 = new Thread2();
		t1.start();
		Thread3 t2 = new Thread3();
		t2.start();
	}

}
// create a 3 thread factorial,fibonacci, even no,odd no.
