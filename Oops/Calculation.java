package Oops;//method overloading

public class Calculation {
	void sum(float a, float b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c = new Calculation();
		c.sum(1, 1f);
		c.sum(2, 5, 7);
	}
}
/*public class MethodOverloading{
	public float sum(float a, int b){
		return a+b;
	}
	public int sum(int i, int j, int k){
		return i+j+k;
	}
	public static void main(String[]args){
		MethodOverloading m1= new MethodOverloading();
		System.out.println("sum of two no is: "+m1.sum(11.2f, 5));
		System.out.println("sum of three no is: "+m1.sum(23, 34, 45));
	}
}*/