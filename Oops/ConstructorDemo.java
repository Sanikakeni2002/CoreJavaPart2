package Oops;

class MyClass1 {
	int x;

	MyClass1() {
		x = 30;
		System.out.println("x=" + x);
	}

	public MyClass1(int i) {
		x = i;
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {

		MyClass1 t = new MyClass1();
		MyClass1 t1 = new MyClass1(10);
		MyClass1 t2 = new MyClass1(20);
		System.out.println(t1.x + " " + t2.x);

	}

}
