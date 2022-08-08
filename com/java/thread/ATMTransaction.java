package com.java.thread;

public class ATMTransaction {

	public static void main(String[] args) {
		for(int i=1; i<4; i++){
			AccountHolder t=new AccountHolder();
			t.setName("Person"+i);
			t.start();
		}
	}
}
class ATMCenter{
	static synchronized void userAction(){
		System.out.println(Thread.currentThread().getName()+"entered");
		System.out.println("Performed Transaction");
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println("Thread Interrupted");
		}
		System.out.println(Thread.currentThread().getName()+"transaction completed");
		System.out.println(Thread.currentThread().getName()+"Leaving.......");
		System.out.println("--------------------------------------------------------------");
	}
}
class AccountHolder extends Thread{
	public void run(){
		try {
			ATMCenter.userAction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}