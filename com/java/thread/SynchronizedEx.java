package com.java.thread;

class SynchronizedEx {
	int amount = 0;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposite...");
		}
		try {
			wait();
		} catch (Exception e) {
			this.amount -= amount;
			System.out.println("withdraw completed...");
		}
	}

	synchronized void deposite(int amount) {
		System.out.println("going to deposite...");
		this.amount += amount;
		System.out.println("deposite completed...");
		notify();
	}

	public static class SynchronizedExThread {
		public static void  main(String[] args) {
			final SynchronizedEx c = new SynchronizedEx();
			Thread t1 = new Thread() {
				public void run() {
					c.withdraw(150000);
				}
			};
			Thread t2 = new Thread() {
				public void run() {
					c.withdraw(100000);
				}
			};
			t1.start();
			t2.start();
		}
	}
}
