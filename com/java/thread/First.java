package com.java.thread;

public class First {
	synchronized public void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Second extends Thread {
	String msg;
	First obj;

	Second(First fp, String str) {
		obj = fp;
		msg = str;
	}

	public void run() {
		obj.display(msg);
	}
}

class Threading {
	public static void main(String[] args) {
		First fnew = new First();
		Second ss = new Second(fnew, "Welcome");
		Second ss1 = new Second(fnew, "to");
		Second ss2 = new Second(fnew, "multi-threading");
		ss.start();
		ss1.start();
		ss2.start();

	}

}
