package com.java.thread;

public class ThreadEx1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Threads is running...");

	}

	public static void main(String[] args) {
		ThreadEx1 t=new ThreadEx1();
		Thread t1 = new Thread(t);
		t1.start();
	}

	
}
