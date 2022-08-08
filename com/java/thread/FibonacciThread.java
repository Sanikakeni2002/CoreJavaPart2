package com.java.thread;

public class FibonacciThread implements Runnable{
	@Override
	public void run() {
		int f1 = 0, f2 = 1;
		System.out.println("Fibonacci Series " + f1 + " " + f2);
		for (int i = 1; i <= 7; i++) {
			int f3 = f1 + f2;
			System.out.println(" " + f3);
			f1 = f2;
			f2 = f3;
		}
		System.out.println("Fibonacci is running..");
	}

public static void main(String[] args) {
	FibonacciThread f = new FibonacciThread();
	Thread t1 = new Thread(f);
	t1.start();
}
}