package Oops;

class Student {
	int rollno=1;
	String name="Sanika";

	void display(){
		System.out.println("RollNo: "+rollno);
		System.out.println("Name: "+name);
	}

	void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	void sub(int a, int b) {
		System.out.println("Substraction: " + (a - b));
	}

	void mul(int a, int b) {
		System.out.println("Multiplication: " + (a * b));
	}

	void div(int a, int b) {
		System.out.println("Division: " + (a / b));
	}

	void mod(int a, int b) {
		System.out.println("Modular: " + (a % b));
	}
}

public class ArithmaticOperations {
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
		s.add(2, 3);
		s.sub(5, 7);
		s.mul(8, 4);
		s.div(2, 12);
		s.mod(4, 8);

	}
}