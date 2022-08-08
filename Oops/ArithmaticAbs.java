package Oops;

abstract class Myclass {
	abstract void calculate(double x);
}

class Square extends Myclass {
	void calculate(double x) {
		System.out.println("Square= " + (x * x));
	}
}

class SqaureRoot extends Myclass {
	void calculate(double x) {
		System.out.println("SquareRoot= " + Math.sqrt(x));
	}
}

public class ArithmaticAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.calculate(7);
		SqaureRoot s1 = new SqaureRoot();
		Myclass reference;
		reference = s;
		s.calculate(6);
	}

}
