package com.java.thread;

public class PrintTable implements Runnable {
	@Override
	public void run() {
		int n = 5;
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}

	}
class Factorial implements Runnable{

	@Override
	public void run() {
		int num=3;
		int i=1;
		int fact=1;
		while(i<num){
			fact*=i;
			i++;
		}
		System.out.println("Factorial number : "+fact);
		System.out.println("Factorial is running...");
	}
	
}
	public static void main(String[] args) {
		PrintTable p = new PrintTable();
		Thread t = new Thread(p);
		t.start();
	//	Factorial f=new Factorial();
	//	Thread t1= new Thread(f);
	//	t1.start();
	}
	}


